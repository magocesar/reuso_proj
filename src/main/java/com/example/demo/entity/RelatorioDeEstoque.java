package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class RelatorioDeEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private LocalDate dataGeracao;

    @OneToMany
    private List<ProdutoEmEstoque> produtos;

    // Constructors, getters, setters

    public void gerarRelatorio() {
        // logic to generate report
    }
}
