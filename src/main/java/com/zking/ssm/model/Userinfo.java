package com.zking.ssm.model;

import java.util.Objects;

public class Userinfo {
    private Long id;
    private Long logininfoId;
    private Integer version;
    private Long bitState;
    private String realName;
    private Integer score;
    private Long realAuthId;
    private String idNumber;
    private String phoneNumber;
    private Long incomeGradeId;
    private Long marriageId;
    private Long kidCountId;
    private Long educationBackgroundId;
    private Long houseConditionId;
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLogininfoId() {
        return logininfoId;
    }

    public void setLogininfoId(Long logininfoId) {
        this.logininfoId = logininfoId;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Long getBitState() {
        return bitState;
    }

    public void setBitState(Long bitState) {
        this.bitState = bitState;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Long getRealAuthId() {
        return realAuthId;
    }

    public void setRealAuthId(Long realAuthId) {
        this.realAuthId = realAuthId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getIncomeGradeId() {
        return incomeGradeId;
    }

    public void setIncomeGradeId(Long incomeGradeId) {
        this.incomeGradeId = incomeGradeId;
    }

    public Long getMarriageId() {
        return marriageId;
    }

    public void setMarriageId(Long marriageId) {
        this.marriageId = marriageId;
    }

    public Long getKidCountId() {
        return kidCountId;
    }

    public void setKidCountId(Long kidCountId) {
        this.kidCountId = kidCountId;
    }

    public Long getEducationBackgroundId() {
        return educationBackgroundId;
    }

    public void setEducationBackgroundId(Long educationBackgroundId) {
        this.educationBackgroundId = educationBackgroundId;
    }

    public Long getHouseConditionId() {
        return houseConditionId;
    }

    public void setHouseConditionId(Long houseConditionId) {
        this.houseConditionId = houseConditionId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Userinfo userinfo = (Userinfo) o;
        return Objects.equals(id, userinfo.id) &&
                Objects.equals(logininfoId, userinfo.logininfoId) &&
                Objects.equals(version, userinfo.version) &&
                Objects.equals(bitState, userinfo.bitState) &&
                Objects.equals(realName, userinfo.realName) &&
                Objects.equals(score, userinfo.score) &&
                Objects.equals(realAuthId, userinfo.realAuthId) &&
                Objects.equals(idNumber, userinfo.idNumber) &&
                Objects.equals(phoneNumber, userinfo.phoneNumber) &&
                Objects.equals(incomeGradeId, userinfo.incomeGradeId) &&
                Objects.equals(marriageId, userinfo.marriageId) &&
                Objects.equals(kidCountId, userinfo.kidCountId) &&
                Objects.equals(educationBackgroundId, userinfo.educationBackgroundId) &&
                Objects.equals(houseConditionId, userinfo.houseConditionId) &&
                Objects.equals(email, userinfo.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logininfoId, version, bitState, realName, score, realAuthId, idNumber, phoneNumber, incomeGradeId, marriageId, kidCountId, educationBackgroundId, houseConditionId, email);
    }
}
