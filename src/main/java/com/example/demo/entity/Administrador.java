package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Administrador extends Funcionario {
    public void gerenciarProdutos() {
        // logic to manage products
    }

    public void gerenciarRelatorioDeEstoque() {
        // logic to manage stock reports
    }

    public void gerarRelatorioDeVendas() {
        // logic to generate sales report
    }
}
