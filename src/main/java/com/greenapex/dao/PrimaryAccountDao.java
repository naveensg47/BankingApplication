package com.greenapex.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenapex.domain.PrimaryAccount;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
