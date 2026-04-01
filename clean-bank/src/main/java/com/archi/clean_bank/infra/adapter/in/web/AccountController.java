package com.archi.clean_bank.infra.adapter.in.web;

import com.archi.clean_bank.application.port.in.TakeOutUseCase;
import com.archi.clean_bank.infra.adapter.in.web.dto.TakeOutRequestDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/account")
public class AccountController {

    private final TakeOutUseCase takeOutUseCase;

    public AccountController(TakeOutUseCase takeOutUseCase) {
        this.takeOutUseCase = takeOutUseCase;
    }

    @PostMapping
    public ResponseEntity<Void> execute(@RequestBody TakeOutRequestDTO takeOutRequestDTO) {
        takeOutUseCase.execute(takeOutRequestDTO.numero(), takeOutRequestDTO.valor());

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
