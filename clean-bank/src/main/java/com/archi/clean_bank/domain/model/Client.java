package com.archi.clean_bank.domain.model;

import java.util.UUID;

public class Client {
    private final UUID uuid;
    private final String cpf;
    private String nome;

    public Client(String nome, String cpf, UUID uuid) {
        this.nome = nome;
        this.cpf = cpf;
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
