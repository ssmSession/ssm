package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Accountflow {
    private Long id;
    private BigDecimal amount;
    private String note;
    private Timestamp tradeTime;
    private Byte actionType;
    private Long accountId;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accountflow that = (Accountflow) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(note, that.note) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                Objects.equals(actionType, that.actionType) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, note, tradeTime, actionType, accountId, usableAmount, freezedAmount);
    }
}
