package com.zking.ssm.controller;

import com.zking.ssm.model.Userinfo;
import com.zking.ssm.service.IUserInfoService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.List;

@RestController
public class UserInfoController {


    @Resource
    private IUserInfoService iUserInfoService;


    /**
     * 根据 logininfo id 进行查询
     * @return
     */
    @RequestMapping("/getUserInfoByLoginInfoId")
    public Object getUserInfoByLoginInfoId(Integer logininfoId){

        DataProtocol dataProtocol = new DataProtocol();

        List<Userinfo> userInfoByLoginInfoId = iUserInfoService.getUserInfoByLoginInfoId(logininfoId);

        try {
            dataProtocol.setData(userInfoByLoginInfoId.get(0));
        }catch (Exception e){
            dataProtocol.setCode(-1);
        }
        return dataProtocol;
    }


}
