package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "relatorio_de_vendas_vendas", uniqueConstraints = {
        @UniqueConstraint(name = "UKsnr7jcxf980run5lo2qxa7m50", columnNames = {"vendas_uid_venda"})
})
public class RelatorioDeVendasVenda {
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "relatorio_de_vendas_uid", nullable = false)
    private RelatorioDeVenda relatorioDeVendasUid;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vendas_uid_venda", nullable = false)
    private Venda vendasUidVenda;

}