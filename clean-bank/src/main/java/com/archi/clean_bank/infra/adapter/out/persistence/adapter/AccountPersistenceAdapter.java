package com.archi.clean_bank.infra.adapter.out.persistence.adapter;

import com.archi.clean_bank.application.port.out.AccountRepositoryPort;
import com.archi.clean_bank.domain.exception.RegraNegocioException;
import com.archi.clean_bank.domain.model.Account;
import com.archi.clean_bank.infra.adapter.out.persistence.entity.AccountEntity;
import com.archi.clean_bank.infra.adapter.out.persistence.mapper.AccountMapper;
import com.archi.clean_bank.infra.adapter.out.persistence.repository.AccountRepositoryJpa;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AccountPersistenceAdapter implements AccountRepositoryPort {

    private final AccountRepositoryJpa accountRepositoryJpa;
    private final AccountMapper accountMapper;

    public AccountPersistenceAdapter(AccountRepositoryJpa accountRepositoryJpa, AccountMapper accountMapper) {
        this.accountRepositoryJpa = accountRepositoryJpa;
        this.accountMapper = accountMapper;
    }

    @Override
    public Optional<Account> findByNumber(String number) {
        return accountRepositoryJpa.findByNumero(number)
                .map(accountMapper::toDomain);
    }

    @Override
    public void save(Account account) {
        AccountEntity accountEntity = accountMapper.toEntity(account);

        accountRepositoryJpa.save(accountEntity);
    }
}
