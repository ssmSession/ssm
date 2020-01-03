package com.zking.ssm.model;

import lombok.ToString;

import java.util.Objects;

@ToString
public class Logininfo {
    private Long id;
    private String username;
    private String password;
    private String phoneNumber;
    private Byte state;
    private Integer userType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Logininfo logininfo = (Logininfo) o;
        return Objects.equals(id, logininfo.id) &&
                Objects.equals(username, logininfo.username) &&
                Objects.equals(password, logininfo.password) &&
                Objects.equals(phoneNumber, logininfo.phoneNumber) &&
                Objects.equals(state, logininfo.state) &&
                Objects.equals(userType, logininfo.userType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password, phoneNumber, state, userType);
    }
}
