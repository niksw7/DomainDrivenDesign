package com.thoughtworks.ddd.account.services;

import com.thoughtworks.ddd.account.model.Account;
import com.thoughtworks.ddd.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nikeshs on 10/06/16.
 */
@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;
    public void createAccount(String id,String customerId){
        accountRepository.save(new Account(id,customerId));
    }
}
