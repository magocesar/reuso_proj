package com.example.demo.service;


import com.example.demo.entity.Fabricante;
import com.example.demo.entityInterface.fabricanteOut;
import com.example.demo.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class fabricanteService {

    @Autowired
    private FabricanteRepository fabricanteRepository;

    public List<fabricanteOut> listarFabricantes() {
        List<Fabricante> fabricantes = fabricanteRepository.findAll();
        return fabricantes.stream().map(fabricanteOut::new).toList();
    }
}
