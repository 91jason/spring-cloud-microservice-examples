/** 
 * Description： 
 * Author：Jason Cao
 * Copyright 2017 xinpear.com. All right reserved
 */
package yali.app.service.storage;

import yali.app.service.data.App;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author jason
 */
@Repository
public class AppStorageImpl implements AppStorage {

    private static final RowMapper<App> APP_ROW_MAPPER = (rs, row) -> {
    	App app = new App();
    	app.setId(rs.getInt("id"));
    	app.setType(App.AppType.values()[rs.getInt("type")]);
    	app.setName(rs.getString("name"));
    	app.setIcon(rs.getString("icon"));
    	app.setStart(rs.getString("start"));
    	app.setStart(rs.getString("short_description"));
    	app.setStart(rs.getString("description"));
    	app.setStart(rs.getString("screenshots"));
    	app.setStart(rs.getString("keywords"));
    	app.setStart(rs.getString("copyright"));
    	app.setStart(rs.getString("market_url"));
    	app.setStart(rs.getString("bundle_id"));
    	app.setStart(rs.getString("sign"));
        return app;
    };
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<App> findAll() {
        return jdbcTemplate.query("select * from yali_app ",APP_ROW_MAPPER);
    }
    
    @Override
    public App findAppDetail() {
		return null;	
    }
}