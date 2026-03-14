package com.archi.clean_bank.application.port.in;

public interface LoginUseCase {
    String executar(String cpf, String senhaPura);
}
