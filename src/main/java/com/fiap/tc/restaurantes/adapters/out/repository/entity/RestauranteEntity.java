package com.fiap.tc.restaurantes.adapters.out.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RestauranteEntity {
  private Long restauranteId;
  private String nome;
  private String localizcao;
  private String tipoDeCozinha;
  private Integer capacidade;
  private LocalDateTime horarioFuncionamento;

}