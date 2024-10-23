package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uidVenda;

    private LocalDate data;
    private double valorTotal;

    @ManyToOne
    private Produto produto;

    @ManyToOne
    private Funcionario funcionario;

    // Constructors, getters, setters

    public void registrarVenda() {
        // logic to register sale
    }
}
