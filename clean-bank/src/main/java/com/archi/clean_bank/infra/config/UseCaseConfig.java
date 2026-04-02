package com.archi.clean_bank.infra.config;

import com.archi.clean_bank.application.port.in.TakeOutUseCase;
import com.archi.clean_bank.application.port.out.AccountRepositoryPort;
import com.archi.clean_bank.application.service.TakeOutService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UseCaseConfig {

    @Bean
    public TakeOutUseCase takeOutUseCase(AccountRepositoryPort accountRepositoryPort){
        return new TakeOutService(accountRepositoryPort);
        }
}