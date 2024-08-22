package com.fiap.tc.restaurantes.infra.gateway;

import com.fiap.tc.restaurantes.application.gateway.RepositorioDeRestaurante;
import com.fiap.tc.restaurantes.domain.domain.Restaurante;
import com.fiap.tc.restaurantes.infra.persistence.RestauranteRepository;

import java.util.List;

public class RepositorioDeRestauranteJPA implements RepositorioDeRestaurante {

    private RestauranteRepository restauranteRepository;
    private final RestauranteEntityMapper restauranteEntityMapper;

    public RepositorioDeRestauranteJPA(RestauranteRepository restauranteRepository, RestauranteEntityMapper restauranteEntityMapper) {
        this.restauranteRepository = restauranteRepository;
        this.restauranteEntityMapper = restauranteEntityMapper;
    }

    @Override
    public Restaurante cadastrar(Restaurante restaurante) {
        return null;
    }

    @Override
    public List<Restaurante> listarTodos() {
        return List.of();
    }

    @Override
    public Restaurante alterarRestaurante(String cnpj, Restaurante restaurante) {
        return null;
    }

    @Override
    public void excluirRestaurante(String cnpj) {

    }
}
