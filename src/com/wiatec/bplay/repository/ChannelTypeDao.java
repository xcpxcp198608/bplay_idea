package com.wiatec.bplay.repository;

import com.wiatec.bplay.entities.ChannelTypeInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Repository
public class ChannelTypeDao extends BaseDao {

    public List<ChannelTypeInfo> getAll(){
        String sql = "select * from channel_type";
        RowMapper<ChannelTypeInfo> rowMapper = new BeanPropertyRowMapper<>(ChannelTypeInfo.class);
        List<ChannelTypeInfo> channelTypeInfoList = jdbcTemplate.query(sql , rowMapper);
        return channelTypeInfoList;
    }
}
