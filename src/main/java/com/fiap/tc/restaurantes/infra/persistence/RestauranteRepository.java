package com.fiap.tc.restaurantes.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RestauranteRepository extends JpaRepository<RestauranteEntity, Long> {
    RestauranteEntity findByNome(String cnpj);
}
