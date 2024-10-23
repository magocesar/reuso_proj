package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "relatorio_de_estoque_produtos", uniqueConstraints = {
        @UniqueConstraint(name = "UKaf62fomhvvra632p6s1l6lkpw", columnNames = {"produtos_uid"})
})
public class RelatorioDeEstoqueProduto {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "relatorio_de_estoque_uid", nullable = false)
    private RelatorioDeEstoque relatorioDeEstoqueUid;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "produtos_uid", nullable = false)
    private ProdutoEmEstoque produtosUid;

}