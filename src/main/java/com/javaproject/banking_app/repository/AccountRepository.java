package com.javaproject.banking_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.banking_app.entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

}
