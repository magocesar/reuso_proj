package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto {
    @Id
    @Column(name = "uid_produto", nullable = false)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco", nullable = false)
    private Double preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lote_id")
    private Lote lote;

    @Column(name = "quantidade", nullable = false)
    private Integer quantidade;

}