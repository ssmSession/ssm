package com.zking.ssm.model;

import lombok.ToString;

import java.util.List;
import java.util.Objects;

@ToString
public class SsmModule {
    private Integer id;
    private Integer pid;
    private String text;
    private String icon;
    private String url;
    private Integer sort;

    List<SsmModule> ssmModules;

    public List<SsmModule> getSsmModules() {
        return ssmModules;
    }

    public void setSsmModules(List<SsmModule> ssmModules) {
        this.ssmModules = ssmModules;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SsmModule ssmModule = (SsmModule) o;
        return Objects.equals(id, ssmModule.id) &&
                Objects.equals(pid, ssmModule.pid) &&
                Objects.equals(text, ssmModule.text) &&
                Objects.equals(icon, ssmModule.icon) &&
                Objects.equals(url, ssmModule.url) &&
                Objects.equals(sort, ssmModule.sort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pid, text, icon, url, sort);
    }
}
