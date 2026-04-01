package com.archi.clean_bank.infra.adapter.in.web.dto;

import java.math.BigDecimal;

public record TakeOutRequestDTO(
        String numero,
        BigDecimal valor
) {
}
