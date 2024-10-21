package com.example.demo.entity;

import com.example.demo.entityInterface.cadastroProdutoIn;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uidProduto;
    private String nome;
    private int quantidade;
    private double preco;

    @ManyToOne
    @JoinColumn(name = "loteId")
    private Lote lote;

    @ManyToOne
    @JoinColumn(name = "fabricanteId")
    private Fabricante fabricante;

    public Produto(cadastroProdutoIn cadastroProdutoIn, Fabricante fabricante, Lote lote) {
        this.nome = cadastroProdutoIn.nomeProduto();
        this.preco = cadastroProdutoIn.precoProduto();
        this.quantidade = cadastroProdutoIn.quantidadeProduto();
        this.fabricante = fabricante;
        this.lote = lote;
    }
}
