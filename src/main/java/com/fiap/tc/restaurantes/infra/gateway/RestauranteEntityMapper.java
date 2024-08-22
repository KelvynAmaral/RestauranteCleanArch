package com.fiap.tc.restaurantes.infra.gateway;

import com.fiap.tc.restaurantes.domain.domain.Restaurante;
import com.fiap.tc.restaurantes.infra.persistence.RestauranteEntity;

public class RestauranteEntityMapper {

    public RestauranteEntity toEntity(Restaurante restaurante) {
        return new RestauranteEntity(restaurante.getCnpj(), restaurante.getNome(),
                restaurante.getCapacidade(), restaurante.getHorarioFuncionamento());
    }
   public Restaurante toDomain(RestauranteEntity restauranteEntity) {
        return new Restaurante(restauranteEntity.getCnpj(), restauranteEntity.getNome(),
                restauranteEntity.getCapacidade());
    }
}
