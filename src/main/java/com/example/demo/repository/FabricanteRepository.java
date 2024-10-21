package com.example.demo.repository;

import com.example.demo.entity.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    Fabricante findByCnpj(String cnpj);
}
