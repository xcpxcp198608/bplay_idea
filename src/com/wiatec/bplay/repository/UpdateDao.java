package com.wiatec.bplay.repository;

import com.wiatec.bplay.entities.UpdateInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by xuchengpeng on 02/05/2017.
 */
@Repository
public class UpdateDao extends BaseDao {

    @Transactional (readOnly = true)
    public UpdateInfo get(){
        String sql = "select * from updater where id = 1;";
        RowMapper<UpdateInfo> updateInfoRowMapper = new BeanPropertyRowMapper<>(UpdateInfo.class);
        return jdbcTemplate.queryForObject(sql ,updateInfoRowMapper);
    }
}
