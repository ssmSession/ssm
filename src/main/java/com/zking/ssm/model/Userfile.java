package com.zking.ssm.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Userfile {
    private Long id;
    private Byte state;
    private String remark;
    private Timestamp auditTime;
    private Timestamp applyTime;
    private Long auditorId;
    private Long applierId;
    private Byte score;
    private String file;
    private Long filetypeId;
    private String image;

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

    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Long getFiletypeId() {
        return filetypeId;
    }

    public void setFiletypeId(Long filetypeId) {
        this.filetypeId = filetypeId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userfile userfile = (Userfile) o;
        return Objects.equals(id, userfile.id) &&
                Objects.equals(state, userfile.state) &&
                Objects.equals(remark, userfile.remark) &&
                Objects.equals(auditTime, userfile.auditTime) &&
                Objects.equals(applyTime, userfile.applyTime) &&
                Objects.equals(auditorId, userfile.auditorId) &&
                Objects.equals(applierId, userfile.applierId) &&
                Objects.equals(score, userfile.score) &&
                Objects.equals(file, userfile.file) &&
                Objects.equals(filetypeId, userfile.filetypeId) &&
                Objects.equals(image, userfile.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, remark, auditTime, applyTime, auditorId, applierId, score, file, filetypeId, image);
    }
}
