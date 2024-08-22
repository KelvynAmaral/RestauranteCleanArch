package com.fiap.tc.restaurantes.application.usecase;

import com.fiap.tc.restaurantes.application.gateway.RepositorioDeRestaurante;
import com.fiap.tc.restaurantes.domain.domain.Restaurante;

public class CriarRestaurante {
    private final RepositorioDeRestaurante repositorioDeRestaurante;

    public CriarRestaurante(RepositorioDeRestaurante repositorioDeRestaurante) {
        this.repositorioDeRestaurante = repositorioDeRestaurante;
    }
    public Restaurante criarRestaurante(Restaurante restaurante) {
        return repositorioDeRestaurante.cadastrar(restaurante);
    }

}
