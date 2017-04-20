package com.wiatec.bplay.repository;

import com.wiatec.bplay.ApplicationContextHelper;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
public class BaseDao {

    protected JdbcTemplate jdbcTemplate;

    public BaseDao() {
        jdbcTemplate = (JdbcTemplate) ApplicationContextHelper.getApplicationContext().getBean("jdbcTemplate");
    }
}
