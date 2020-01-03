package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Systemaccountflow {
    private Long id;
    private Timestamp tradeTime;
    private Byte actionType;
    private BigDecimal amount;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;
    private String note;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Timestamp tradeTime) {
        this.tradeTime = tradeTime;
    }

    public Byte getActionType() {
        return actionType;
    }

    public void setActionType(Byte actionType) {
        this.actionType = actionType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUsableAmount() {
        return usableAmount;
    }

    public void setUsableAmount(BigDecimal usableAmount) {
        this.usableAmount = usableAmount;
    }

    public BigDecimal getFreezedAmount() {
        return freezedAmount;
    }

    public void setFreezedAmount(BigDecimal freezedAmount) {
        this.freezedAmount = freezedAmount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Systemaccountflow that = (Systemaccountflow) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                Objects.equals(actionType, that.actionType) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tradeTime, actionType, amount, usableAmount, freezedAmount, note);
    }
}
