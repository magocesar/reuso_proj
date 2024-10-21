package com.example.demo.service;

import com.example.demo.entity.Produto;
import com.example.demo.entityInterface.produtoOut;
import com.example.demo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class produtosService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<produtoOut> listarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(produtoOut::new).toList();
    }
}
