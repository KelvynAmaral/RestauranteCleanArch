package com.fiap.tc.restaurantes.infra.controller;

import com.fiap.tc.restaurantes.application.usecase.CriarRestaurante;
import com.fiap.tc.restaurantes.application.usecase.ListarRestaurante;
import com.fiap.tc.restaurantes.domain.domain.Restaurante;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/restaurantes")
public class RestauranteController {

    private final CriarRestaurante criarRestaurante;
    private final ListarRestaurante listarRestaurante;

    public RestauranteController(CriarRestaurante criarRestaurante, ListarRestaurante listarRestaurante) {
        this.criarRestaurante = criarRestaurante;
        this.listarRestaurante = listarRestaurante;
    }

   @GetMapping
    public List<RestauranteDto> listarRestaurante() {
       return listarRestaurante.ObeterTodosRestaurantes().stream()
               .map(restaurante -> new RestauranteDto(
                       restaurante.getCnpj(),
                       restaurante.getNome(),
                       restaurante.getCapacidade(),
                       restaurante.getHorarioFuncionamento()
               ))
               .collect(Collectors.toList());
   }
   @PostMapping
    public RestauranteDto criarRestaurante(@RequestBody RestauranteDto restauranteDto) {
       Restaurante salvo = criarRestaurante.criarRestaurante(new Restaurante(
               restauranteDto.cnpj(),
               restauranteDto.nome(),
            restauranteDto.horarioFuncionamento()));
         return new RestauranteDto(
                salvo.getCnpj(),
                salvo.getNome(),
                salvo.getCapacidade(),
                salvo.getHorarioFuncionamento()
        );
        }
}
