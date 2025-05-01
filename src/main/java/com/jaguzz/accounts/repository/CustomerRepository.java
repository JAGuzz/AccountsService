package com.jaguzz.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaguzz.accounts.entity.Customer;



public interface CustomerRepository extends JpaRepository<Customer, Long>{

    Optional<Customer> findByMobileNumber(String mobileNumber);

}
