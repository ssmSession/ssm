package com.zking.ssm.model;

import java.util.Objects;

public class Userbankinfo {
    private Long id;
    private String bankName;
    private String accountName;
    private String accountNumber;
    private String forkName;
    private Long logininfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getForkName() {
        return forkName;
    }

    public void setForkName(String forkName) {
        this.forkName = forkName;
    }

    public Long getLogininfoId() {
        return logininfoId;
    }

    public void setLogininfoId(Long logininfoId) {
        this.logininfoId = logininfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userbankinfo that = (Userbankinfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(bankName, that.bankName) &&
                Objects.equals(accountName, that.accountName) &&
                Objects.equals(accountNumber, that.accountNumber) &&
                Objects.equals(forkName, that.forkName) &&
                Objects.equals(logininfoId, that.logininfoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bankName, accountName, accountNumber, forkName, logininfoId);
    }
}
