package com.zking.ssm.service;

import com.zking.ssm.BaseTest;
import com.zking.ssm.model.Userinfo;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

public class UserInfoServiceImplTest extends BaseTest {

    @Resource
    private IUserInfoService iUserInfoService;

    @Test
    public void getUserInfoByLoginInfoId() {
        List<Userinfo> userInfoByLoginInfoId = iUserInfoService.getUserInfoByLoginInfoId(9);
        userInfoByLoginInfoId.forEach(x-> System.out.println(x));
    }
}