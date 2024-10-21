package com.example.demo.entityInterface;

import com.example.demo.entity.Fabricante;
import com.example.demo.entity.Lote;
import com.example.demo.entity.Produto;

public record cadastroProdutoOut(
        String nomeProduto,
        int quantidadeProduto,
        double precoProduto,
        String dataFabricacao,
        String dataValidade,
        String cnpjFabricante,
        String nomeFabricante,
        String cepFabricante
) {

    public cadastroProdutoOut(Produto produto, Fabricante fabricante, Lote lote){
        this(produto.getNome(),
                produto.getQuantidade(),
                produto.getPreco(),
                lote.getDataFabricacao().toString(),
                lote.getDataValidade().toString(),
                fabricante.getCnpj(),
                fabricante.getNome(),
                fabricante.getCep()
        );
    }
}
