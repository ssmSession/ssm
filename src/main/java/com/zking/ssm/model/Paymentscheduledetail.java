package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Paymentscheduledetail {
    private Long id;
    private BigDecimal bidAmount;
    private Long bidId;
    private BigDecimal totalAmount;
    private BigDecimal principal;
    private BigDecimal interest;
    private Integer monthIndex;
    private Timestamp deadLine;
    private Long bidrequestId;
    private Timestamp payDate;
    private Integer returnType;
    private Long paymentScheduleId;
    private Long fromLogininfoId;
    private Long toLogininfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getBidAmount() {
        return bidAmount;
    }

    public void setBidAmount(BigDecimal bidAmount) {
        this.bidAmount = bidAmount;
    }

    public Long getBidId() {
        return bidId;
    }

    public void setBidId(Long bidId) {
        this.bidId = bidId;
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

    public Integer getMonthIndex() {
        return monthIndex;
    }

    public void setMonthIndex(Integer monthIndex) {
        this.monthIndex = monthIndex;
    }

    public Timestamp getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(Timestamp deadLine) {
        this.deadLine = deadLine;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Timestamp getPayDate() {
        return payDate;
    }

    public void setPayDate(Timestamp payDate) {
        this.payDate = payDate;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Long getPaymentScheduleId() {
        return paymentScheduleId;
    }

    public void setPaymentScheduleId(Long paymentScheduleId) {
        this.paymentScheduleId = paymentScheduleId;
    }

    public Long getFromLogininfoId() {
        return fromLogininfoId;
    }

    public void setFromLogininfoId(Long fromLogininfoId) {
        this.fromLogininfoId = fromLogininfoId;
    }

    public Long getToLogininfoId() {
        return toLogininfoId;
    }

    public void setToLogininfoId(Long toLogininfoId) {
        this.toLogininfoId = toLogininfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paymentscheduledetail that = (Paymentscheduledetail) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(bidAmount, that.bidAmount) &&
                Objects.equals(bidId, that.bidId) &&
                Objects.equals(totalAmount, that.totalAmount) &&
                Objects.equals(principal, that.principal) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(monthIndex, that.monthIndex) &&
                Objects.equals(deadLine, that.deadLine) &&
                Objects.equals(bidrequestId, that.bidrequestId) &&
                Objects.equals(payDate, that.payDate) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(paymentScheduleId, that.paymentScheduleId) &&
                Objects.equals(fromLogininfoId, that.fromLogininfoId) &&
                Objects.equals(toLogininfoId, that.toLogininfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bidAmount, bidId, totalAmount, principal, interest, monthIndex, deadLine, bidrequestId, payDate, returnType, paymentScheduleId, fromLogininfoId, toLogininfoId);
    }
}
