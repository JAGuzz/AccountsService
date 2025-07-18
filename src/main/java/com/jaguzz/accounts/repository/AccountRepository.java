package com.jaguzz.accounts.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import com.jaguzz.accounts.entity.Accounts;

import jakarta.transaction.Transactional;

public interface AccountRepository extends JpaRepository<Accounts, Long> {

    Optional<Accounts> findByCustomerId(Long customerId);

    @Transactional @Modifying
    void deleteByCustomerId(Long customerId);

}
