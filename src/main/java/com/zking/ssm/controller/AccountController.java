package com.zking.ssm.controller;

import com.amazonaws.services.cloudwatch.model.Datapoint;
import com.zking.ssm.model.Account;
import com.zking.ssm.service.IAccountService;
import com.zking.ssm.util.DataProtocol;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.xml.crypto.Data;

/**
 * 账户
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Resource
    private IAccountService iAccountService;

    /**
     * 查询用户的account信息
     * @return
     */
    @RequestMapping("/selectAccountById")
    public Object selectAccountById(Account account){

        DataProtocol dataProtocol = new DataProtocol();

        try {
            Account acc = iAccountService.selectAccountById(account);
            dataProtocol.setData(acc);
        }catch (Exception e){
            e.printStackTrace();
            dataProtocol.setCode(-1);
        }
        return  dataProtocol;
    }


}
