package com.fiap.tc.restaurantes.config;

import com.fiap.tc.restaurantes.application.gateway.RepositorioDeRestaurante;
import com.fiap.tc.restaurantes.application.usecase.CriarRestaurante;
import com.fiap.tc.restaurantes.application.usecase.ListarRestaurante;
import com.fiap.tc.restaurantes.infra.gateway.RepositorioDeRestauranteJPA;
import com.fiap.tc.restaurantes.infra.gateway.RestauranteEntityMapper;
import com.fiap.tc.restaurantes.infra.persistence.RestauranteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RestauranteConfig {

    @Bean
    CriarRestaurante criarRestaurante(RepositorioDeRestaurante repositorioDeRestaurante) {
        return new CriarRestaurante(repositorioDeRestaurante);
    }
    @Bean
    ListarRestaurante listarRestaurante(RepositorioDeRestaurante repositorioDeRestaurante) {
        return new ListarRestaurante(repositorioDeRestaurante);
    }
    @Bean
    RepositorioDeRestauranteJPA repositorioDeRestauranteJPA(RestauranteRepository restauranteRepository, RestauranteEntityMapper restauranteEntityMapper) {
        return new RepositorioDeRestauranteJPA(restauranteRepository, restauranteEntityMapper);
    }
    @Bean
    RestauranteEntityMapper retornaMapper() {
        return new RestauranteEntityMapper();
    }
}
