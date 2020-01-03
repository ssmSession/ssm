package com.zking.ssm.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Systemaccount {
    private Long id;
    private Integer version;
    private BigDecimal usableAmount;
    private BigDecimal freezedAmount;

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
        Systemaccount that = (Systemaccount) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(version, that.version) &&
                Objects.equals(usableAmount, that.usableAmount) &&
                Objects.equals(freezedAmount, that.freezedAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, version, usableAmount, freezedAmount);
    }
}
