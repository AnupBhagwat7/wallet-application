package com.xyz.service;

import com.xyz.model.Customer;
import com.xyz.repository.CustomerRespository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRespository customerRespository;

    CustomerService(CustomerRespository customerRepository){
        this.customerRespository = customerRepository;
    }

    public Customer saveCustomer(Customer customer){
        return customerRespository.save(customer);
    }
}
