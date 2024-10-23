package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "venda")
public class Venda {
    @Id
    @Column(name = "uid_venda", nullable = false)
    private Integer id;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "valor_total", nullable = false)
    private Double valorTotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "funcionario_uid")
    private Funcionario funcionarioUid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_uid_produto")
    private Produto produtoUidProduto;

}