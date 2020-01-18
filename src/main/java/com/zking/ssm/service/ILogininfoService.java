package com.zking.ssm.service;

import com.zking.ssm.model.Logininfo;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface ILogininfoService {

    Logininfo getUserByNameAndPwd(Logininfo logininfo);

    int userRegister(Logininfo logininfo);

    List<Logininfo> getLoginInfoByUserTypePage(Integer userType, PageBean pageBean);

    void updateLoginInfoState(Logininfo logininfo);

    void updateLoginInfoUserType(Logininfo logininfo);

    Logininfo getLogininfo(Logininfo logininfo);
}
