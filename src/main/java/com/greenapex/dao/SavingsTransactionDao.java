package com.greenapex.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenapex.domain.SavingsTransaction;

import java.util.List;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}
