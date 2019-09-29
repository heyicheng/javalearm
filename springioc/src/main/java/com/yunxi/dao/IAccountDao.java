package com.yunxi.dao;

import com.yunxi.domain.Account;

import java.util.List;

public interface IAccountDao {
    List<Account> findAllAccount();
    Account findAccountById(Integer id);
    void updateAccount(Account account);
    void saveAccount(Account account);
    void deleteAccount(Integer id);
}
