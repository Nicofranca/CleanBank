package com.archi.clean_bank.application.port.out;

public interface TokenGeneretorPort {

    String generate(String subject, String role); //vai recebe CPF e role, devolvendo o Token ass

    String getSubjet(String token);

    String getRole(String token);
}
