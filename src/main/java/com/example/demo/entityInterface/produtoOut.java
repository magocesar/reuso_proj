package com.example.demo.entityInterface;

import com.example.demo.entity.Produto;

import java.time.LocalDate;

public record produtoOut(
        int uidProduto,
        String nome,
        int quantidade,
        double preco,
        String fabricante,
        LocalDate dataFabricacao,
        LocalDate dataValidade
) {

    public produtoOut(Produto produto){
        this(
                produto.getUidProduto(),
                produto.getNome(),
                produto.getQuantidade(),
                produto.getPreco(),
                produto.getFabricante().getNome(),
                produto.getLote().getDataFabricacao(),
                produto.getLote().getDataValidade()
        );
    }
}
