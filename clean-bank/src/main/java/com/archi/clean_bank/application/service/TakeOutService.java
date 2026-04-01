package com.archi.clean_bank.application.service;

import com.archi.clean_bank.application.port.in.TakeOutUseCase;
import com.archi.clean_bank.application.port.out.AccountRepositoryPort;
import com.archi.clean_bank.domain.exception.RegraNegocioException;
import com.archi.clean_bank.domain.model.Account;

import java.math.BigDecimal;

public class TakeOutService implements TakeOutUseCase {

    private final AccountRepositoryPort accountRepositoryPort;

    public TakeOutService(AccountRepositoryPort accountRepositoryPort) {
        this.accountRepositoryPort = accountRepositoryPort;
    }

    @Override
    public void execute(String accountNumber, BigDecimal value) {

        Account account = accountRepositoryPort.findByNumber(accountNumber)
                .orElseThrow(() -> new RegraNegocioException("Conta não encontrada! "));

        account.sacar(value);

        accountRepositoryPort.save(account);
    }
}
