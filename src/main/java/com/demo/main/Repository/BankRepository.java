package com.demo.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.main.Entity.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Long> {

}
