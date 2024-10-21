package com.example.demo.entity;

import com.example.demo.entityInterface.cadastroProdutoIn;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Lote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uidLote;

    private LocalDate dataFabricacao;
    private LocalDate dataValidade;

    @OneToMany(mappedBy = "lote", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Lote(cadastroProdutoIn cadastroProdutoIn) {
        this.dataFabricacao = cadastroProdutoIn.dataFabricacao();
        this.dataValidade = cadastroProdutoIn.dataValidade();
    }
}
