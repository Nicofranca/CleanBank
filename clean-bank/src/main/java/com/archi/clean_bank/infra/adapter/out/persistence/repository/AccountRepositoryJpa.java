package com.archi.clean_bank.infra.adapter.out.persistence.repository;

import com.archi.clean_bank.infra.adapter.out.persistence.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface AccountRepositoryJpa extends JpaRepository<AccountEntity, UUID> {
    Optional<AccountEntity> findByNumero(String number);
}
