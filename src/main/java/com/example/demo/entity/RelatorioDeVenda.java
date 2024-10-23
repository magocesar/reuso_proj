package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "relatorio_de_vendas")
public class RelatorioDeVenda {
    @Id
    @Column(name = "uid", nullable = false)
    private Integer id;

    @Column(name = "data_geracao")
    private LocalDate dataGeracao;

}