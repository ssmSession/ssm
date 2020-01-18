package com.zking.ssm.controller;

import com.aliyuncs.exceptions.ClientException;
import com.amazonaws.services.cloudwatch.model.Datapoint;
import com.zking.ssm.model.Iplog;
import com.zking.ssm.model.Logininfo;
import com.zking.ssm.service.IIplogService;
import com.zking.ssm.service.ILogininfoService;
import com.zking.ssm.util.DataProtocol;
import com.zking.ssm.util.MD5Util;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.SmsSnedUtil;
import jdk.nashorn.internal.parser.DateParser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class LogininfoController {

    @Resource
    private ILogininfoService logininfoService;

    @Resource
    private IIplogService iIplogService;

    /**
     * 用户登录
     * @param logininfo
     * @return
     */
    @RequestMapping("/login")
    public Object login(Logininfo logininfo) {
//        md5加密
        String strpwd = MD5Util.getMd5(logininfo.getPassword());
        logininfo.setPassword(strpwd);
        Logininfo user = logininfoService.getUserByNameAndPwd(logininfo);
        DataProtocol data = new DataProtocol();
        if (user != null) {
            data.setCode(DataProtocol.SUCCESS);
            data.setData(user);
            Thread thread=new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Iplog iplog = new Iplog();
                        /*
                         * 取出用户id和用户name赋值给iplog对象
                         */
                        iplog.setLogininfoid(user.getId());
                        iplog.setUsername(user.getUsername());
                        iIplogService.addIplog(iplog);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("===task finish===");
                }
            });

            thread.start();

        } else {
            data.setCode(DataProtocol.FAIL);
            data.setMessage("用户名或密码错误");
        }
        return data;
    }

    /**
     * 用户注册
     * @param logininfo
     * @return
     * @throws ClientException
     */
    @RequestMapping("/register")
    public Object register(Logininfo logininfo) throws ClientException {
        String strpwd = MD5Util.getMd5(logininfo.getPassword());
        logininfo.setPassword(strpwd);
        int i = logininfoService.userRegister(logininfo);
        DataProtocol data = new DataProtocol();
        if (i > 0) {
            data.setCode(DataProtocol.SUCCESS);
        } else {
            data.setCode(DataProtocol.FAIL);
            data.setMessage("注册失败");
        }
        return data;
    }

    /**
     * 返回短信验证码
     *
     * @return
     */
    @RequestMapping("/phone")
    public Object getphone(String phoneNumber) throws Exception {
        //短信验证
        String phoneNum = SmsSnedUtil.send(phoneNumber);

        DataProtocol data = new DataProtocol();

        data.setData(phoneNum);

        return data;
    }

    /**
     * 根据用户类型获取
     *
     * @return
     */
    @RequestMapping("/getLoginByUserType")
    public Object getLoginInfoByUserType(Integer userType, HttpServletRequest request) {
        DataProtocol dataProtocol = new DataProtocol();

        PageBean pageBean=new PageBean();

        pageBean.setRequest(request);

        List<Logininfo> loginInfoByUserType = logininfoService.getLoginInfoByUserTypePage(userType,pageBean);

        dataProtocol.setTotal(pageBean.getTotal());

        dataProtocol.setData(loginInfoByUserType);

        return dataProtocol;
    }

    /**
     * 修改用户状态
     *
     * @return
     */
    @RequestMapping("/updateLoginInfoState")
    public Object updateLoginInfoState(Logininfo logininfo) {

        DataProtocol dataProtocol = new DataProtocol();

        String strPwd = MD5Util.getMd5(logininfo.getPassword());

        logininfo.setPassword(strPwd);
        try {
            logininfoService.updateLoginInfoState(logininfo);
            dataProtocol.setCode(1);
        } catch (Exception e) {
            System.out.println(e);
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }

    /**
     * 修改用户的类型
     *
     * @param logininfo
     * @return
     */
    @RequestMapping("/updateLoginInfoUserType")
    public Object updateLoginInfoUserType(Logininfo logininfo) {

        DataProtocol dataProtocol = new DataProtocol();
        try {
            logininfoService.updateLoginInfoUserType(logininfo);
        } catch (Exception e) {
            dataProtocol.setCode(-1);
        }

        return dataProtocol;
    }


    @RequestMapping("/loadLogininfo")
    public Object loadLogininfo(Logininfo logininfo){
        DataProtocol data=new DataProtocol();
        try {
            Logininfo logins = logininfoService.getLogininfo(logininfo);
            data.setData(logins);
            data.setCode(DataProtocol.SUCCESS);
        } catch (Exception e) {
            data.setCode(-1);
        }
        return data;

    }


}
