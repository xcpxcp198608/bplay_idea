package com.wiatec.bplay.action;

import com.wiatec.bplay.entities.UpdateInfo;
import com.wiatec.bplay.repository.UpdateDao;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by xuchengpeng on 02/05/2017.
 */
@Controller
public class ActionUpdate extends BaseAction {

    private UpdateInfo updateInfo;
    @Autowired
    private UpdateDao updateDao;

    public void get(){
        updateInfo = updateDao.get();
        updateInfo.setFileName(updateInfo.getPackageName()+".apk");
        out.println(JSONObject.fromObject(updateInfo));
        out.flush();
        out.close();
    }

    public UpdateInfo getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(UpdateInfo updateInfo) {
        this.updateInfo = updateInfo;
    }
}
