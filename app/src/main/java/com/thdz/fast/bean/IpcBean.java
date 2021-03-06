package com.thdz.fast.bean;

import android.text.TextUtils;

import java.io.Serializable;

/**
 * desc:    网络摄像头实体类， 端口port默认是8000
 * author:  Administrator
 * date:    2018/11/2  14:59
 */
public class IpcBean implements Serializable {

    private String deviceId; // 100000-Fos1-IPC1
    private String ipcNo;  // 1
    private String ipcName; // 基地大门摄像机
    private String ip; // 133.124.42.85
    private String userName; // admin
    private String password; // 123456
    private int channel;  // 33

    public IpcBean() {

    }

    public IpcBean(String deviceId, String ipcNo, String ipcName, String ip, String userName, String password, int channel) {
        this.deviceId = deviceId;
        this.ipcNo = ipcNo;
        this.ipcName = ipcName;
        this.ip = ip;
        this.userName = userName;
        this.password = password;
        this.channel = channel;
    }

    public boolean isValid() {
        if (TextUtils.isEmpty(deviceId) ||
                TextUtils.isEmpty(ip) ||
                TextUtils.isEmpty(userName) ||
                TextUtils.isEmpty(password) ||
                channel <= 0) {
            return false;
        }
        return true;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getIpcNo() {
        return ipcNo;
    }

    public void setIpcNo(String ipcNo) {
        this.ipcNo = ipcNo;
    }

    public String getIpcName() {
        return ipcName;
    }

    public void setIpcName(String ipcName) {
        this.ipcName = ipcName;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return "IpcBean{" +
                "deviceId='" + deviceId + '\'' +
                ", ipcNo='" + ipcNo + '\'' +
                ", ipcName='" + ipcName + '\'' +
                ", ip='" + ip + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", channel=" + channel +
                '}';
    }
}
