package com.wzgiceman.daggerdemo.entity;

/**
 * Created by WZG on 2016/11/2.
 */

public class User {
    private String name;
    private String sex;
    private String ads;

    public User(String name, String sex, String ads) {
        this.name = name;
        this.sex = sex;
        this.ads = ads;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAds() {
        return ads;
    }

    public void setAds(String ads) {
        this.ads = ads;
    }
}
