package com.archi.clean_bank.domain.model;

import com.archi.clean_bank.domain.exception.RegraNegocioException;

import java.util.UUID;

public class User {
    private final UUID id;
    private final String cpf;
    private String senhaCripto;
    private String role;

    public User(UUID id, String cpf, String senhaCripto, String role) {
        this.id = id;
        this.cpf = cpf;
        this.senhaCripto = senhaCripto;
        this.role = role != null ? role: "ROLE_USER";
    }

    public void alterarSenha(String novaSenhaCripto){
        if (novaSenhaCripto == null || novaSenhaCripto.isBlank()){
            throw new RegraNegocioException("A nova senha não pode ser null! ");
        }

        if (novaSenhaCripto.equals(this.senhaCripto)){
            throw new RegraNegocioException("A nova senha não pode ser igual a antiga! ");
        }
    }




    public UUID getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenhaCripto() {
        return senhaCripto;
    }

    public String getRole() {
        return role;
    }
}
