package com.archi.clean_bank.infra.adapter.out.persistence.repository;

import com.archi.clean_bank.infra.adapter.out.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, UUID> {
}
