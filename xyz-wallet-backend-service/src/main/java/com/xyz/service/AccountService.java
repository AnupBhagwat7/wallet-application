package com.xyz.service;

import com.xyz.model.Account;
import com.xyz.model.Customer;
import com.xyz.repository.AccountRepository;
import com.xyz.repository.CustomerRespository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;
    private CustomerRespository customerRespository;

    AccountService(AccountRepository accountRepository, CustomerRespository customerRespository){
        this.accountRepository = accountRepository;
        this.customerRespository = customerRespository;
    }
    public void createAccount(Customer customer){

        Account account = accountRepository.save(Account.builder().balance(10).customer(customer).build());

        //customer.setAccount(account);
        //customerRespository.save(customer);
    }
}
