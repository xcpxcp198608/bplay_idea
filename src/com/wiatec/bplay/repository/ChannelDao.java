package com.wiatec.bplay.repository;

import com.wiatec.bplay.entities.ChannelInfo;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Repository
public class ChannelDao extends BaseDao {

    @Transactional (readOnly = true)
    public List<ChannelInfo> getAll(){
        sql = "select * from channel order by `name`";
        return jdbcTemplate.query(sql , channelInfoRowMapper);
    }

    @Transactional (readOnly = true)
    public List<ChannelInfo> getChannelByCountry(String country){
        sql = "select * from channel where country=? order by `name` limit 0,10000;";
        return jdbcTemplate.query(sql , channelInfoRowMapper ,country);
    }

    @Transactional (readOnly = true)
    public List<ChannelInfo> getChannelByStyle(String style){
        sql = "select * from channel where style=? order by `name` limit 0,10000";
        return jdbcTemplate.query(sql , channelInfoRowMapper ,style);
    }
}
