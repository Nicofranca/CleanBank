package com.archi.clean_bank.domain.model;

import jakarta.validation.ValidationException;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    private final UUID id;
    private final String numero;
    private final Client client;
    private BigDecimal saldo;
    private BigDecimal limit;

    public Account(UUID id, String numero, Client client, BigDecimal saldo, BigDecimal limit) {
        this.id = id;
        this.numero = numero;
        this.client = client;
        this.saldo = BigDecimal.ZERO;
        this.limit = limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public UUID getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public Client getClient() {
        return client;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public BigDecimal deposit(BigDecimal valor){
        try {
            if (valor>0){
                this.saldo = this.saldo.add(valor);
            }

            return valor;
        } catch (ValidationException e);
    }
}
