package com.yunxi.service.impl;

import com.yunxi.dao.IAccountDao;
import com.yunxi.domain.Account;
import com.yunxi.service.IAccountService;

import java.util.List;

public class AccountServiceImpl implements IAccountService {
    // 业务层用来调用持久层
    private IAccountDao accountDao;
    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }


    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findAccountById(Integer id) {
        return accountDao.findAccountById();
    }

    public void updateAccount(Account account) {
        accountDao.updateAccount(account);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void deleteAccount(Integer id) {
        accountDao.deleteAccount(id);
    }


}
