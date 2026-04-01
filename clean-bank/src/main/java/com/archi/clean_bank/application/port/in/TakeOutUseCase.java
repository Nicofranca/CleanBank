package com.archi.clean_bank.application.port.in;

import java.math.BigDecimal;

public interface TakeOutUseCase {
    void execute(String AccountNumber, BigDecimal value);
}
