package com.zking.ssm.service;

import com.zking.ssm.model.Logininfo;

import java.util.List;

public interface ILogininfoService {

    Logininfo getUserByNameAndPwd(Logininfo logininfo);

    int userRegister(Logininfo logininfo);

    List<Logininfo> getLoginInfoByUserType(Integer userType);

    void updateLoginInfoState(Logininfo logininfo);

    void updateLoginInfoUserType(Logininfo logininfo);
}
