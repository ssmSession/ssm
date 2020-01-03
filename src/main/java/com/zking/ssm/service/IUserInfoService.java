package com.zking.ssm.service;

import com.zking.ssm.model.Userinfo;

import java.util.List;

public interface IUserInfoService {

    public List<Userinfo> getUserInfoByLoginInfoId(Integer logininfoId);


}
