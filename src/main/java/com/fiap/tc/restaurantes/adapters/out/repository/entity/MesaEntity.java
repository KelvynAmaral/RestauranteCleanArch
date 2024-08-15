package com.fiap.tc.restaurantes.adapters.out.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MesaEntity {
  private Long mesaId;
  private Long restauranteId;
  private int status;
  private Integer quantidadeAssentons;
}
