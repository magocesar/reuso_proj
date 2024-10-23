package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fabricante")
public class Fabricante {
    @Id
    @Column(name = "uid_fabricante", nullable = false)
    private Integer id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numero_cep", nullable = false)
    private Integer numeroCep;

}