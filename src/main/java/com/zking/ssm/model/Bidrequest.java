package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Bidrequest {
    private Long id;
    private Integer version;
    private Integer returnType;
    private Byte bidRequestType;
    private Byte bidRequestState;
    private BigDecimal bidRequestAmount;
    private BigDecimal currentRate;
    private Byte monthes2Return;
    private Integer bidCount;
    private BigDecimal totalRewardAmount;
    private BigDecimal currentSum;
    private String title;
    private String description;
    private String note;
    private Timestamp disableDate;
    private Long createuserId;
    private Byte disableDays;
    private BigDecimal minBidAmount;
    private Timestamp applyTime;
    private Timestamp publishTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getReturnType() {
        return returnType;
    }

    public void setReturnType(Integer returnType) {
        this.returnType = returnType;
    }

    public Byte getBidRequestType() {
        return bidRequestType;
    }

    public void setBidRequestType(Byte bidRequestType) {
        this.bidRequestType = bidRequestType;
    }

    public Byte getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Byte bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    public BigDecimal getBidRequestAmount() {
        return bidRequestAmount;
    }

    public void setBidRequestAmount(BigDecimal bidRequestAmount) {
        this.bidRequestAmount = bidRequestAmount;
    }

    public BigDecimal getCurrentRate() {
        return currentRate;
    }

    public void setCurrentRate(BigDecimal currentRate) {
        this.currentRate = currentRate;
    }

    public Byte getMonthes2Return() {
        return monthes2Return;
    }

    public void setMonthes2Return(Byte monthes2Return) {
        this.monthes2Return = monthes2Return;
    }

    public Integer getBidCount() {
        return bidCount;
    }

    public void setBidCount(Integer bidCount) {
        this.bidCount = bidCount;
    }

    public BigDecimal getTotalRewardAmount() {
        return totalRewardAmount;
    }

    public void setTotalRewardAmount(BigDecimal totalRewardAmount) {
        this.totalRewardAmount = totalRewardAmount;
    }

    public BigDecimal getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(BigDecimal currentSum) {
        this.currentSum = currentSum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getDisableDate() {
        return disableDate;
    }

    public void setDisableDate(Timestamp disableDate) {
        this.disableDate = disableDate;
    }

    public Long getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(Long createuserId) {
        this.createuserId = createuserId;
    }

    public Byte getDisableDays() {
        return disableDays;
    }

    public void setDisableDays(Byte disableDays) {
        this.disableDays = disableDays;
    }

    public BigDecimal getMinBidAmount() {
        return minBidAmount;
    }

    public void setMinBidAmount(BigDecimal minBidAmount) {
        this.minBidAmount = minBidAmount;
    }

    public Timestamp getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
    }

    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bidrequest that = (Bidrequest) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version) &&
                Objects.equals(returnType, that.returnType) &&
                Objects.equals(bidRequestType, that.bidRequestType) &&
                Objects.equals(bidRequestState, that.bidRequestState) &&
                Objects.equals(bidRequestAmount, that.bidRequestAmount) &&
                Objects.equals(currentRate, that.currentRate) &&
                Objects.equals(monthes2Return, that.monthes2Return) &&
                Objects.equals(bidCount, that.bidCount) &&
                Objects.equals(totalRewardAmount, that.totalRewardAmount) &&
                Objects.equals(currentSum, that.currentSum) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(note, that.note) &&
                Objects.equals(disableDate, that.disableDate) &&
                Objects.equals(createuserId, that.createuserId) &&
                Objects.equals(disableDays, that.disableDays) &&
                Objects.equals(minBidAmount, that.minBidAmount) &&
                Objects.equals(applyTime, that.applyTime) &&
                Objects.equals(publishTime, that.publishTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, returnType, bidRequestType, bidRequestState, bidRequestAmount, currentRate, monthes2Return, bidCount, totalRewardAmount, currentSum, title, description, note, disableDate, createuserId, disableDays, minBidAmount, applyTime, publishTime);
    }
}
