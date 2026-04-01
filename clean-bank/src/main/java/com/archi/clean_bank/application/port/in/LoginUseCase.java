package com.archi.clean_bank.application.port.in;

public interface LoginUseCase {
    String execute(String cpf, String senhaPura);
}
