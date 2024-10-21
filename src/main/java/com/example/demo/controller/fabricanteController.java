package com.example.demo.controller;

import com.example.demo.entityInterface.fabricanteOut;
import com.example.demo.service.fabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fabricante")
@CrossOrigin(origins = "*")
public class fabricanteController {


    @Autowired
    private fabricanteService fabricanteService;


    @GetMapping()
    public List<fabricanteOut> listarFabricantes() {
        return fabricanteService.listarFabricantes();
    }
}
