package com.greenapex.service;

import java.security.Principal;

import org.springframework.stereotype.Service;

import com.greenapex.domain.PrimaryAccount;
import com.greenapex.domain.SavingsAccount;

@Service
public interface AccountService {

    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
}
