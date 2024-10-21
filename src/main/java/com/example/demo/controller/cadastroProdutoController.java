package com.example.demo.controller;

import com.example.demo.entityInterface.cadastroProdutoIn;
import com.example.demo.entityInterface.cadastroProdutoOut;
import com.example.demo.service.cadastroProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cadastroProduto")
public class cadastroProdutoController {

    @Autowired
    private cadastroProdutoService cadastroProdutoService;

    @PostMapping()
    public ResponseEntity<cadastroProdutoOut> cadastrarProduto(@Valid @RequestBody cadastroProdutoIn cadastroProdutoIn) {
        return cadastroProdutoService.cadastrarProduto(cadastroProdutoIn);
    }
}