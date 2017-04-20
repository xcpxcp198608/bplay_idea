package com.wiatec.bplay.service;

import com.wiatec.bplay.entities.ChannelInfo;
import com.wiatec.bplay.repository.ChannelDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Service
public class ChannelService {

    @Autowired
    private ChannelDao channelDao;

    public List<ChannelInfo> getAll(){
        return channelDao.getAll();
    }
}
