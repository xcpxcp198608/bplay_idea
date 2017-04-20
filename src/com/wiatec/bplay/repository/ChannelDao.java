package com.wiatec.bplay.repository;

import com.wiatec.bplay.entities.ChannelInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Repository
public class ChannelDao extends BaseDao {

    public List<ChannelInfo> getAll(){
        String sql = "select * from channel";
        RowMapper<ChannelInfo> rowMapper = new BeanPropertyRowMapper<>(ChannelInfo.class);
        List<ChannelInfo> channelInfoList = jdbcTemplate.query(sql , rowMapper);
        return channelInfoList;
    }
}
