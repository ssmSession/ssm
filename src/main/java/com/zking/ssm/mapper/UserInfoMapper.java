package com.zking.ssm.mapper;

import com.zking.ssm.model.Logininfo;
import com.zking.ssm.model.Userinfo;

import java.util.List;

/**
 * 用户信息
 */
public interface UserInfoMapper {

    /**
     * 根据login登录的账号信息进行链表查询
     * @param logininfoId
     * @return
     */
    public List<Userinfo> getUserInfoByLoginInfoId (Integer logininfoId);

}
