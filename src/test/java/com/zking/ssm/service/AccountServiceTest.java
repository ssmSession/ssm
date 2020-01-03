package com.zking.ssm.service;

import com.zking.ssm.BaseTest;
import com.zking.ssm.model.Account;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

public class AccountServiceTest extends BaseTest {

    @Resource
    private IAccountService iAccountService;

    @Test
    public void selectAccountById() {

        Account account = new Account();

        account.setId(Long.valueOf(10));

        Account account1 = iAccountService.selectAccountById(account);

        System.out.println(account1);

    }
}