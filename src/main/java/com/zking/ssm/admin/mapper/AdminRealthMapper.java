package com.zking.ssm.admin.mapper;

import com.zking.ssm.model.Realauth;

import java.util.List;

public interface AdminRealthMapper {

    /**
     * 查询所有实名认证  or 根据审核状态查询
     * @param realauth
     * @return
     */
    public List<Realauth> getRealth(Realauth realauth);
}
