package com.zking.ssm.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Mailverify {
    private Long id;
    private Long userinfoId;
    private Timestamp deadline;
    private String randomcode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public String getRandomcode() {
        return randomcode;
    }

    public void setRandomcode(String randomcode) {
        this.randomcode = randomcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mailverify that = (Mailverify) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userinfoId, that.userinfoId) &&
                Objects.equals(deadline, that.deadline) &&
                Objects.equals(randomcode, that.randomcode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userinfoId, deadline, randomcode);
    }
}
