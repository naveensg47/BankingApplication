package com.greenapex.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenapex.domain.SavingsAccount;

public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
