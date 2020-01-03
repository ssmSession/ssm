package com.zking.ssm.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Objects;

public class Iplog {
    private Long id;
    private String ip;
    private Byte state;
    private String username;
    private Long logininfoid;
    private Byte userType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp logintime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getLogininfoid() {
        return logininfoid;
    }

    public void setLogininfoid(Long logininfoid) {
        this.logininfoid = logininfoid;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public Timestamp getLogintime() {
        return logintime;
    }

    public void setLogintime(Timestamp logintime) {
        this.logintime = logintime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Iplog iplog = (Iplog) o;
        return Objects.equals(id, iplog.id) &&
                Objects.equals(ip, iplog.ip) &&
                Objects.equals(state, iplog.state) &&
                Objects.equals(username, iplog.username) &&
                Objects.equals(logininfoid, iplog.logininfoid) &&
                Objects.equals(userType, iplog.userType) &&
                Objects.equals(logintime, iplog.logintime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ip, state, username, logininfoid, userType, logintime);
    }
}
