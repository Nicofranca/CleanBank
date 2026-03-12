package com.archi.clean_bank.domain.exception;

public class SaldoInsuficienteException extends RegraNegocioException {
  public SaldoInsuficienteException(String message) {
    super(message);
  }
}
