package com.example.demo.controller;

import com.example.demo.entityInterface.produtoOut;
import com.example.demo.service.produtosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class produtosController {

    @Autowired()
    private produtosService produtosService;

    @GetMapping()
    public List<produtoOut> listarProdutos() {
        return produtosService.listarProdutos();
    }
}
