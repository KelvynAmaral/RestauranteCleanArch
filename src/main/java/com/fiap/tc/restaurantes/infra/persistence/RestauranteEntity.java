package com.fiap.tc.restaurantes.infra.persistence;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurante")
public class RestauranteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cnpj;
    private String nome;
    private String capacidade;
    private String horarioFuncionamento;

    public RestauranteEntity() {
    }


    public RestauranteEntity(String cnpj, String nome, String capacidade, String horarioFuncionamento) {

        this.cnpj = cnpj;
        this.nome = nome;
        this.capacidade = capacidade;
        this.horarioFuncionamento = horarioFuncionamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getHorarioFuncionamento() {
        return horarioFuncionamento;
    }

    public void setHorarioFuncionamento(String horarioFuncionamento) {
        this.horarioFuncionamento = horarioFuncionamento;
    }
}
