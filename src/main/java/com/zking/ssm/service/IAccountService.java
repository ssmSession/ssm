package com.zking.ssm.service;

import com.zking.ssm.model.Account;

/**
 * 账户的服务层
 */
public interface IAccountService {

    Account selectAccountById(Account account);

}
