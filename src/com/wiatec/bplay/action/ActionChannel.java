package com.wiatec.bplay.action;

import com.wiatec.bplay.entities.ChannelInfo;
import com.wiatec.bplay.service.ChannelService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
@Controller
public class ActionChannel extends BaseAction{

    @Autowired
    private ChannelService channelService;
    private ChannelInfo channelInfo;
    private List<ChannelInfo> channelInfoList;


    public void get(){
        channelInfoList = channelService.getAll();
        out.println(JSONArray.fromObject(channelInfoList));
        out.flush();
        out.close();
    }


    public ChannelInfo getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(ChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public List<ChannelInfo> getChannelInfoList() {
        return channelInfoList;
    }

    public void setChannelInfoList(List<ChannelInfo> channelInfoList) {
        this.channelInfoList = channelInfoList;
    }
}
