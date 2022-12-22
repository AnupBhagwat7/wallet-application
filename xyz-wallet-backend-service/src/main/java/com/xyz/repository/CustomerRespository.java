package com.xyz.repository;

import com.xyz.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRespository extends JpaRepository<Customer,Long> {
}
