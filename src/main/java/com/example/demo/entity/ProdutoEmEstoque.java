package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto_em_estoque", uniqueConstraints = {
        @UniqueConstraint(name = "UKlcp6hqforeha79chlewoe1tre", columnNames = {"produto_uid_produto"})
})
public class ProdutoEmEstoque {
    @Id
    @Column(name = "uid", nullable = false)
    private Integer id;

    @Column(name = "porcentagem_minima", nullable = false)
    private Double porcentagemMinima;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "produto_uid_produto")
    private Produto produtoUidProduto;

}