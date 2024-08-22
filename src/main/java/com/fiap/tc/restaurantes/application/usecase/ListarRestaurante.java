package com.fiap.tc.restaurantes.application.usecase;

import com.fiap.tc.restaurantes.application.gateway.RepositorioDeRestaurante;
import com.fiap.tc.restaurantes.domain.domain.Restaurante;

import java.util.List;

public class ListarRestaurante {
    private final RepositorioDeRestaurante repositorioDeRestaurante;

    public ListarRestaurante(RepositorioDeRestaurante repositorioDeRestaurante) {
        this.repositorioDeRestaurante = repositorioDeRestaurante;
    }
    public List<Restaurante> ObeterTodosRestaurantes() {
        return this.repositorioDeRestaurante.listarTodos();
    }
}
