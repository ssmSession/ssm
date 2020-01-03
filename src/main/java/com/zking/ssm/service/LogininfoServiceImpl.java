package com.zking.ssm.service;

import com.zking.ssm.mapper.LogininfoMapper;
import com.zking.ssm.model.Logininfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import java.util.List;


@Service
public class LogininfoServiceImpl implements ILogininfoService {
    @Resource
    private LogininfoMapper logininfoMapper;

    @Override
    public Logininfo getUserByNameAndPwd(Logininfo logininfo){
        return logininfoMapper.getUserByNameAndPwd(logininfo);
    }

    @Override
    public int userRegister(Logininfo logininfo){
        return logininfoMapper.userRegister(logininfo);
    }

    @Override
    public List<Logininfo> getLoginInfoByUserType(Integer userType){
        return logininfoMapper.getLoginInfosByUserType(userType);
    }

    @Override
    public void updateLoginInfoState(Logininfo logininfo) {
        logininfoMapper.updateLoginInfoState(logininfo);
    }

    @Override
    public void updateLoginInfoUserType(Logininfo logininfo){
        logininfoMapper.updateLoginInfoUserType(logininfo);
    }

}
