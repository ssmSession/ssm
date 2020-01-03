package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Rechargeoffline {
    private Long id;
    private Byte state;
    private String remark;
    private Timestamp auditTime;
    private Timestamp applyTime;
    private Long auditorId;
    private Long applierId;
    private String tradeCode;
    private Timestamp tradeTime;
    private BigDecimal amount;
    private String note;
    private Long bankinfoId;

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

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public Timestamp getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Timestamp tradeTime) {
        this.tradeTime = tradeTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getBankinfoId() {
        return bankinfoId;
    }

    public void setBankinfoId(Long bankinfoId) {
        this.bankinfoId = bankinfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rechargeoffline that = (Rechargeoffline) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(state, that.state) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(auditTime, that.auditTime) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(auditorId, that.auditorId) &&
                Objects.equals(applierId, that.applierId) &&
                Objects.equals(tradeCode, that.tradeCode) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(note, that.note) &&
                Objects.equals(bankinfoId, that.bankinfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, state, remark, auditTime, applyTime, auditorId, applierId, tradeCode, tradeTime, amount, note, bankinfoId);
    }
}
