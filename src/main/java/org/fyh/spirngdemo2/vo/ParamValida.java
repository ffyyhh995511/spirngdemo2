package org.fyh.spirngdemo2.vo;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;

public class ParamValida {


    /** 电话号码 **/
    private String tel;

    /** 绑定用户的机器码 **/
    @NotNull(message = "绑定用户的机器码不允许为空")
    private String deviceCode;

    /** 用户设备类型 **/
    @NotNull(message = "用户设备类型不允许为空")
    private String deviceType;

    /** 验证码 **/
    @NotBlank(message = "验证码不允许为空")
    private String code;

    /** token **/
    private String token;

    /** app数据 **/
    private String appData;

    /** 城市 **/
    private String city;

    /** 登录ip **/
    private String ip;

    /** 经纬度 **/
    private String lat;

    private String lng;

    private String ver;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppData() {
        return appData;
    }

    public void setAppData(String appData) {
        this.appData = appData;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
