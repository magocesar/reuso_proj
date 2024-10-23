package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class ProdutoEmEstoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uid;

    private double porcentagemMinima;

    @OneToOne
    private Produto produto;

    // Constructors, getters, setters

    public void atualizarQuantidade() {
        // logic to update quantity
    }

    public void gerarAlerta() {
        // logic to generate alert
    }
}
