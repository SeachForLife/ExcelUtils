package com.carl_yang.domain;

/**
 * Created by carl_yang on 2017/5/24.
 */

public class User {
    private String userName;
    private int userid;
    private long longtest;
    private double doubletest;
    private boolean mboolean;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public long getLongtest() {
        return longtest;
    }

    public void setLongtest(long longtest) {
        this.longtest = longtest;
    }

    public double getDoubletest() {
        return doubletest;
    }

    public void setDoubletest(double doubletest) {
        this.doubletest = doubletest;
    }

    public boolean isMboolean() {
        return mboolean;
    }

    public void setMboolean(boolean mboolean) {
        this.mboolean = mboolean;
    }
}
