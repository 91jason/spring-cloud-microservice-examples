/**
 * @(#)UserController.java, 十月 28, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package yali.app.service.web;

import yali.app.service.data.App;
import yali.app.service.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jason
 */
@RestController
public class AppController {

    private static final Logger LOG = LoggerFactory.getLogger(AppController.class);

    @Autowired
    AppService userService;

    @RequestMapping(value="/applist",method= RequestMethod.GET)
    public List<App> readUserInfo(){
        List<App> ls=userService.searchAll();
//        LOG.info("request come to here!");
        return ls;
    }
    
    @RequestMapping(value="/app/detail",method= RequestMethod.POST,consumes="application/json",produces="application/json")
    public List<App> getAppDetail(@RequestBody App appinfo){
        List<App> list = new ArrayList<App>();
    	list.add(appinfo);
        return list;
    }
}