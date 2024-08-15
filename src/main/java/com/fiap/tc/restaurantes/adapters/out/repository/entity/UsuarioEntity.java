package com.fiap.tc.restaurantes.adapters.out.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioEntity {
  private Long usuarioId;
  private String nome;
  private String email;
  private String senha;
  private String telefone;

}
