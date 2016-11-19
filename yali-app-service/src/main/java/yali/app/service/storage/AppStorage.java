/**
 * @(#)UserDao.java, 十月 28, 2016.
 * <p>
 * Copyright 2016 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package yali.app.service.storage;

import yali.app.service.data.App;

import java.util.List;

/**
 * @author jason
 */
public interface AppStorage {

    List<App> findAll();
    
    App findAppDetail();
}
