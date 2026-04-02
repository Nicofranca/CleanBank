package com.archi.clean_bank.domain.model;

import com.archi.clean_bank.domain.exception.SaldoInsuficienteException;
import com.archi.clean_bank.domain.exception.ValorInvalidoException;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    private final UUID id;
    private final String numero;
    private final Client client;
    private BigDecimal saldo;
    private BigDecimal limit;

    public Account(UUID id, String numero, Client client, BigDecimal limit) {
        this.id = id;
        this.numero = numero;
        this.client = client;
        this.limit = limit;
        this.saldo = BigDecimal.ZERO;
    }

    private Account(UUID id, String numero, Client client, BigDecimal saldo, BigDecimal limit) {
        this.id = id;
        this.numero = numero;
        this.client = client;
        this.saldo = saldo;
        this.limit = limit;
    }

    public void deposit(BigDecimal valor){
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorInvalidoException("O valor de depósito deve ser maior que 0! ");
        }

        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor){
        if (valor == null || valor.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorInvalidoException("Valor do saque deve ser maior que 0! ");
        }

        BigDecimal saldoDisponivel = this.saldo.add(this.limit);

        if (valor.compareTo(saldoDisponivel)>0){
            throw new SaldoInsuficienteException("Saldo insuficiente para saque! ");
        }

        this.saldo = this.saldo.subtract(valor);
    }

    public void aumentarLimit(BigDecimal newLimit){
        if (newLimit == null || newLimit.compareTo(BigDecimal.ZERO) <= 0){
            throw new ValorInvalidoException("Valor não pode ser 0! ");
        }

        this.limit = newLimit;
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


}
