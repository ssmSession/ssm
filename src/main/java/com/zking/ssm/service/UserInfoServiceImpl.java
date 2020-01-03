package com.zking.ssm.service;

import com.zking.ssm.mapper.UserInfoMapper;
import com.zking.ssm.model.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Override
    public List<Userinfo> getUserInfoByLoginInfoId(Integer logininfoId) {
        return userInfoMapper.getUserInfoByLoginInfoId(logininfoId);
    }
}

