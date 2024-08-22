package com.fiap.tc.restaurantes.domain.domain;

public class Endereco {
    private String cep;
    private Integer numero;
    private String complemento;
    private String estado;
    private String cidade;
    private String bairro;

    public Endereco(String cep, Integer numero, String complemento, String estado, String cidade, String bairro) {
        if (cep == null || !cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP inválido");
        }
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
    }
}
