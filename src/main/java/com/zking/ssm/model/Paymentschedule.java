package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Paymentschedule {
    private Long id;
    private Timestamp deadLine;
    private Timestamp payDate;
    private BigDecimal totalAmount;
    private BigDecimal principal;
    private BigDecimal interest;
    private BigDecimal monthIndex;
    private Integer state;
    private Integer bidRequestType;
    private Integer returnType;
    private String bidRequestTitle;
    private Long borrowUserId;
    private Long bidRequestId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Timestamp deadLine) {
        this.deadLine = deadLine;
    }

    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getMonthIndex() {
        return monthIndex;
    }

    public void setMonthIndex(BigDecimal monthIndex) {
        this.monthIndex = monthIndex;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Integer bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle;
    }

    public Long getBorrowUserId() {
        return borrowUserId;
    }

    public void setBorrowUserId(Long borrowUserId) {
        this.borrowUserId = borrowUserId;
    }

    public Long getBidRequestId() {
        return bidRequestId;
    }

    public void setBidRequestId(Long bidRequestId) {
        this.bidRequestId = bidRequestId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paymentschedule that = (Paymentschedule) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(deadLine, that.deadLine) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(principal, that.principal) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(monthIndex, that.monthIndex) &&
                Objects.equals(state, that.state) &&
                Objects.equals(bidRequestType, that.bidRequestType) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(bidRequestTitle, that.bidRequestTitle) &&
                Objects.equals(borrowUserId, that.borrowUserId) &&
                Objects.equals(bidRequestId, that.bidRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deadLine, payDate, totalAmount, principal, interest, monthIndex, state, bidRequestType, returnType, bidRequestTitle, borrowUserId, bidRequestId);
    }
}
