package com.fiap.tc.restaurantes.infra.controller;

public record RestauranteDto(
        String cnpj,
        String nome,
        String capacidade,
        String horarioFuncionamento
) {

}