package com.zking.ssm.service;

import com.zking.ssm.mapper.AccountMapper;
import com.zking.ssm.model.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AccountService implements IAccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account selectAccountById(Account account) {
        return accountMapper.selectAccountById(account);
    }

}
