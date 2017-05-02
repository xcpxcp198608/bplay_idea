package com.wiatec.bplay.entities;

/**
 * Created by xuchengpeng on 02/05/2017.
 */
public class UpdateInfo {
    private int id;
    private String packageName;
    private String fileName;
    private String url;
    private String info;
    private String version;
    private int code;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "UpdateInfo{" +
                "id=" + id +
                ", packageName='" + packageName + '\'' +
                ", fileName='" + fileName + '\'' +
                ", url='" + url + '\'' +
                ", info='" + info + '\'' +
                ", version='" + version + '\'' +
                ", code=" + code +
                '}';
    }
}
