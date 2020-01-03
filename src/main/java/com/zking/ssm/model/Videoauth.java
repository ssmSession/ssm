package com.zking.ssm.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Videoauth {
    private Long id;
    private Byte state;
    private String remark;
    private Timestamp auditTime;
    private Timestamp applyTime;
    private Long auditorId;
    private Long applierId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
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
        Videoauth videoauth = (Videoauth) o;
        return Objects.equals(id, videoauth.id) &&
                Objects.equals(state, videoauth.state) &&
                Objects.equals(remark, videoauth.remark) &&
                Objects.equals(auditTime, videoauth.auditTime) &&
                Objects.equals(applyTime, videoauth.applyTime) &&
                Objects.equals(auditorId, videoauth.auditorId) &&
                Objects.equals(applierId, videoauth.applierId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, remark, auditTime, applyTime, auditorId, applierId);
    }
}
