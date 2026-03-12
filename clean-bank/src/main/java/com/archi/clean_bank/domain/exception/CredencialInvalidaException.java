package com.archi.clean_bank.domain.exception;

public class CredencialInvalidaException extends RuntimeException {
  public CredencialInvalidaException(String message) {
    super(message+"s");
  }
}
