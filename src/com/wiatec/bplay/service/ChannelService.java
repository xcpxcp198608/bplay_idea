package com.wiatec.bplay.service;

import com.wiatec.bplay.entities.ChannelInfo;
import com.wiatec.bplay.repository.ChannelDao;
import com.wiatec.bplay.utils.AESUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Service
public class ChannelService {

    @Autowired
    private ChannelDao channelDao;
    private List<ChannelInfo> channelInfoList;

    @Transactional (readOnly = true)
    public List<ChannelInfo> getAll(){
        channelInfoList = channelDao.getAll();
        try {
        for (ChannelInfo channelInfo : channelInfoList){
            channelInfo.setUrl(AESUtil.encrypt(channelInfo.getUrl() , AESUtil.key));
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return channelInfoList;
    }

    @Transactional (readOnly = true)
    public List<ChannelInfo> getChannelByCountry(String country){
        channelInfoList = channelDao.getChannelByCountry(country);
        try {
            for (ChannelInfo channelInfo : channelInfoList){
                channelInfo.setUrl(AESUtil.encrypt(channelInfo.getUrl() , AESUtil.key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return channelInfoList;
    }

    @Transactional (readOnly = true)
    public List<ChannelInfo> getChannelByStyle(String style){
        channelInfoList = channelDao.getChannelByStyle(style);
        try {
            for (ChannelInfo channelInfo : channelInfoList){
                channelInfo.setUrl(AESUtil.encrypt(channelInfo.getUrl() , AESUtil.key));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return channelInfoList;
    }
}
