package com.greenapex.dao;

import org.springframework.data.repository.CrudRepository;

import com.greenapex.domain.PrimaryTransaction;

import java.util.List;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
