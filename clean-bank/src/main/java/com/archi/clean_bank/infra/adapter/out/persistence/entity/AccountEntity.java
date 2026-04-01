package com.archi.clean_bank.infra.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(name = "account")
public class AccountEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column
    private String numero;

    @OneToOne
    @JoinColumn(name = "client_id")
    private UUID clientId;

    @Column
    private BigDecimal saldo;

    @Column(name = "balance_limit")
    private BigDecimal limit;

}
