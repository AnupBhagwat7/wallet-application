package com.xyz.service;

import com.xyz.model.Account;
import com.xyz.model.Customer;
import com.xyz.repository.AccountRepository;

public class AccountService {

    private AccountRepository accountRepository;

    AccountService(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    public Account createAccount(Customer customer){

        accountRepository.save();
    }
}
