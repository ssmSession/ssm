
package com.zking.ssm.service;

import com.zking.ssm.BaseTest;
import com.zking.ssm.model.Logininfo;
import org.junit.Test;
import javax.annotation.Resource;
import java.util.List;


public class LogininfoServiceImplTest extends BaseTest {

    @Resource
    private ILogininfoService logininfoService;

    @Test
    public void getUserByNameAndPwd() {
        Logininfo logininfo=new Logininfo();
        logininfo.setUsername("admin");
        logininfo.setPassword("123");
        Logininfo logins = logininfoService.getUserByNameAndPwd(logininfo);
        System.out.println(logins);
    }

    @Test
    public void userRegister() {
        Logininfo logininfo=new Logininfo();
        logininfo.setUsername("admin");
        logininfo.setPassword("123");
        logininfo.setPhoneNumber("13762523773");
        int user = logininfoService.userRegister(logininfo);
        System.out.println(user);

    }

    @Test
    public void getUserType(){

        List<Logininfo> loginInfoByUserType = logininfoService.getLoginInfoByUserType(1);

        loginInfoByUserType.forEach(x-> System.out.println(x));

    }
}