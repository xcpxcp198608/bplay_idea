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
    private String country;
    private String style;

    public void get(){
        channelInfoList = channelService.getAll();
        out.println(JSONArray.fromObject(channelInfoList));
        out.flush();
        out.close();
    }

    public void getChannelByCountry(){
        channelInfoList = channelService.getChannelByCountry(country);
        out.println(JSONArray.fromObject(channelInfoList));
        out.flush();
        out.close();
    }

    public void getChannelByStyle(){
        channelInfoList = channelService.getChannelByStyle(style);
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }
}
