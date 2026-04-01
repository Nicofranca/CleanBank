package com.archi.clean_bank.application.port.out;

import com.archi.clean_bank.domain.model.Account;

import java.util.Optional;

public interface AccountRepositoryPort {
    Optional<Account> findByNumber(String number);
    void save(Account account);
}
