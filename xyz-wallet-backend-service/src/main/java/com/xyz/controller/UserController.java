package com.xyz.controller;

import com.xyz.model.Account;
import com.xyz.model.Customer;
import com.xyz.service.AccountService;
import com.xyz.service.CustomerService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin()
@RequestMapping("/api/v1/customer")
public class UserController {

    private CustomerService customerService;

    private AccountService accountService;

    UserController(CustomerService customerService,AccountService accountService){
        this.customerService = customerService;
        this.accountService = accountService;
    }

    @PostMapping("/register")
    public Customer register(@RequestBody Customer customer){

        Customer customer1 =customerService.saveCustomer(customer);

        accountService.createAccount(customer1);

        return customer1;
    }
}
