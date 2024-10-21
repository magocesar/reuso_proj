package com.example.demo.entityInterface;

import com.example.demo.entity.Fabricante;

public record fabricanteOut(
        int uidFabricante,
        String nome,
        String cnpj,
        String cep,
        int numeroCep
) {
    public fabricanteOut(Fabricante fabricante){
        this(
                fabricante.getUidFabricante(),
                fabricante.getNome(),
                fabricante.getCnpj(),
                fabricante.getCep(),
                fabricante.getNumeroCep()
        );
    }
}
