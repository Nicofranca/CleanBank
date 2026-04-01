package com.archi.clean_bank.infra.adapter.out.persistence.mapper;

import com.archi.clean_bank.domain.model.Account;
import com.archi.clean_bank.infra.adapter.out.persistence.entity.AccountEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    AccountEntity toEntity (Account account);
    Account toDomain (AccountEntity accountEntity);
}
