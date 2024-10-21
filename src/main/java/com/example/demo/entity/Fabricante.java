package com.example.demo.entity;

import com.example.demo.entityInterface.cadastroProdutoIn;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Fabricante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uidFabricante;
    private String nome;
    private String cep;
    private String cnpj;
    private int numeroCep;

    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Fabricante(cadastroProdutoIn cadastroProdutoIn){
        this.nome = cadastroProdutoIn.nomeFabricante();
        this.cep = cadastroProdutoIn.cepFabricante();
        this.cnpj = cadastroProdutoIn.cnpjFabricante();
        this.numeroCep = Integer.parseInt(cadastroProdutoIn.cepFabricante().replaceAll("[^0-9]", ""));
    }
}