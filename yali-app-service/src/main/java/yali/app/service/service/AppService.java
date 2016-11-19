/**
 * @(#)AppService.java, 十月 28, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package yali.app.service.service;

import yali.app.service.data.App;
import yali.app.service.storage.AppStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author jason
 */
@Service
@Transactional
public class AppService {


    @Autowired
    private AppStorage appMapper;

    public List<App> searchAll(){
        List<App> list = appMapper.findAll();
        return list;
    }
}