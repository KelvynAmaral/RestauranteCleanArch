package com.fiap.tc.restaurantes.domain.domain;

public class FabricaDeRestaurante {

    private Restaurante restaurante;

    public Restaurante criarRestaurante(String cnpj, String nome, Integer capacidade, String horarioFuncionamento) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        return new Restaurante(cnpj, nome, capacidade, horarioFuncionamento);
    }

    public Endereco incluirEndereco(String cep, Integer numero, String complemento, String estado, String cidade, String bairro) {
        if (cep == null || !cep.matches("\\d{8}")) {
            throw new IllegalArgumentException("CEP inválido");
        }
        return new Endereco(cep, numero, complemento, estado, cidade, bairro);
    }
}
