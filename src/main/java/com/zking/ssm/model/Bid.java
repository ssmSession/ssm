package com.zking.ssm.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class Bid {
    private Long id;
    private BigDecimal actualRate;
    private BigDecimal availableAmount;
    private Long bidrequestId;
    private Long bidUserId;
    private Timestamp bidTime;
    private String bidRequestTitle;
    private Integer bidRequestState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getActualRate() {
        return actualRate;
    }

    public void setActualRate(BigDecimal actualRate) {
        this.actualRate = actualRate;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public Long getBidrequestId() {
        return bidrequestId;
    }

    public void setBidrequestId(Long bidrequestId) {
        this.bidrequestId = bidrequestId;
    }

    public Long getBidUserId() {
        return bidUserId;
    }

    public void setBidUserId(Long bidUserId) {
        this.bidUserId = bidUserId;
    }

    public Timestamp getBidTime() {
        return bidTime;
    }

    public void setBidTime(Timestamp bidTime) {
        this.bidTime = bidTime;
    }

    public String getBidRequestTitle() {
        return bidRequestTitle;
    }

    public void setBidRequestTitle(String bidRequestTitle) {
        this.bidRequestTitle = bidRequestTitle;
    }

    public Integer getBidRequestState() {
        return bidRequestState;
    }

    public void setBidRequestState(Integer bidRequestState) {
        this.bidRequestState = bidRequestState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bid bid = (Bid) o;
        return Objects.equals(id, bid.id) &&
                Objects.equals(actualRate, bid.actualRate) &&
                Objects.equals(availableAmount, bid.availableAmount) &&
                Objects.equals(bidrequestId, bid.bidrequestId) &&
                Objects.equals(bidUserId, bid.bidUserId) &&
                Objects.equals(bidTime, bid.bidTime) &&
                Objects.equals(bidRequestTitle, bid.bidRequestTitle) &&
                Objects.equals(bidRequestState, bid.bidRequestState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actualRate, availableAmount, bidrequestId, bidUserId, bidTime, bidRequestTitle, bidRequestState);
    }
}
