package com.zking.ssm.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Realauth {
    private Long id;
    private String realname;
    private Byte sex;
    private String bornDate;
    private String idNumber;
    private String address;
    private Byte state;
    private String image1;
    private String image2;
    private String remark;
    private Timestamp auditTime;
    private Timestamp applyTime;
    private Long auditorId;
    private Long applierId;

    private  String appler;

    private String stateDesc;

    private String username;

    public String getAppler() {
        return appler;
    }

    public void setAppler(String appler) {
        this.appler = appler;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStateDesc() {
        return stateDesc;
    }

    public void setStateDesc(String stateDesc) {
        this.stateDesc = stateDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getBornDate() {
        return bornDate;
    }

    public void setBornDate(String bornDate) {
        this.bornDate = bornDate;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Timestamp getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Timestamp auditTime) {
        this.auditTime = auditTime;
    }

    public Timestamp getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    public Long getAuditorId() {
        return auditorId;
    }

    public void setAuditorId(Long auditorId) {
        this.auditorId = auditorId;
    }

    public Long getApplierId() {
        return applierId;
    }

    public void setApplierId(Long applierId) {
        this.applierId = applierId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Realauth realauth = (Realauth) o;
        return Objects.equals(id, realauth.id) &&
                Objects.equals(realname, realauth.realname) &&
                Objects.equals(sex, realauth.sex) &&
                Objects.equals(bornDate, realauth.bornDate) &&
                Objects.equals(idNumber, realauth.idNumber) &&
                Objects.equals(address, realauth.address) &&
                Objects.equals(state, realauth.state) &&
                Objects.equals(image1, realauth.image1) &&
                Objects.equals(image2, realauth.image2) &&
                Objects.equals(remark, realauth.remark) &&
                Objects.equals(auditTime, realauth.auditTime) &&
                Objects.equals(applyTime, realauth.applyTime) &&
                Objects.equals(auditorId, realauth.auditorId) &&
                Objects.equals(applierId, realauth.applierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, realname, sex, bornDate, idNumber, address, state, image1, image2, remark, auditTime, applyTime, auditorId, applierId);
    }
}
