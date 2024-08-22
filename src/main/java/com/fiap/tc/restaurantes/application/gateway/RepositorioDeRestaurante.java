package com.fiap.tc.restaurantes.application.gateway;

import com.fiap.tc.restaurantes.domain.domain.Restaurante;

import java.util.List;

public interface RepositorioDeRestaurante {

    Restaurante cadastrar(Restaurante restaurante);
    List<Restaurante> listarTodos();
    Restaurante alterarRestaurante(String cnpj, Restaurante restaurante);
    void excluirRestaurante(String cnpj);


}
