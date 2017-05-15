package com.wiatec.bplay.repository;

import com.wiatec.bplay.ApplicationContextHelper;
import com.wiatec.bplay.entities.ChannelInfo;
import com.wiatec.bplay.entities.ChannelTypeInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
public class BaseDao {

    protected JdbcTemplate jdbcTemplate;
    protected String sql = "";
    protected RowMapper<ChannelInfo> channelInfoRowMapper;
    protected RowMapper<ChannelTypeInfo> channelTypeInfoRowMapper;

    public BaseDao() {
        jdbcTemplate = (JdbcTemplate) ApplicationContextHelper.getApplicationContext().getBean("jdbcTemplate");
        channelInfoRowMapper = new BeanPropertyRowMapper<>(ChannelInfo.class);
        channelTypeInfoRowMapper = new BeanPropertyRowMapper<>(ChannelTypeInfo.class);
    }
}
