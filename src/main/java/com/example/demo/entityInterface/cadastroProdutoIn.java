package com.example.demo.entityInterface;

import jakarta.validation.constraints.*;

import java.time.LocalDate;

public record cadastroProdutoIn(
        @NotBlank String nomeProduto,
        @Min(1) int quantidadeProduto,
        @Positive double precoProduto,
        @NotNull LocalDate dataFabricacao,
        @NotNull LocalDate dataValidade,
        @NotNull String cnpjFabricante,
        String nomeFabricante,
        String cepFabricante,
        String numeroCep,
        @NotNull tipoTransacao tipoTransacao
) {
    public enum tipoTransacao {
        fabricanteExistente,
        fabricanteNovo
    }
}