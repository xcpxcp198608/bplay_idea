package com.wiatec.bplay.action;

import com.wiatec.bplay.entities.ChannelTypeInfo;
import com.wiatec.bplay.repository.ChannelTypeDao;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Controller
public class ActionChannelType extends  BaseAction {

    private ChannelTypeInfo channelTypeInfo;
    private List<ChannelTypeInfo> channelTypeInfoList;
    @Autowired
    private ChannelTypeDao channelTypeDao;

    public void get(){
        channelTypeInfoList = channelTypeDao.getAll();
        out.println(JSONArray.fromObject(channelTypeInfoList));
        out.flush();
        out.close();
    }

    public ChannelTypeInfo getChannelTypeInfo() {
        return channelTypeInfo;
    }

    public void setChannelTypeInfo(ChannelTypeInfo channelTypeInfo) {
        this.channelTypeInfo = channelTypeInfo;
    }

    public List<ChannelTypeInfo> getChannelTypeInfoList() {
        return channelTypeInfoList;
    }

    public void setChannelTypeInfoList(List<ChannelTypeInfo> channelTypeInfoList) {
        this.channelTypeInfoList = channelTypeInfoList;
    }
}
