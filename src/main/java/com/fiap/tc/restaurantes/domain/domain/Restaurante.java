package com.fiap.tc.restaurantes.domain.domain;

public class Restaurante {
    private String cnpj;
    private String nome;
    private String capacidade;
    private String horarioFuncionamento;

    public Restaurante(String cnpj, String nome, String capacidade) {
        if (cnpj == null || !cnpj.matches("\\d{14}")) {
            throw new IllegalArgumentException("CNPJ inválido");
        }
        this.cnpj = cnpj;
        this.nome = nome;
        this.capacidade = capacidade;
        this.horarioFuncionamento = horarioFuncionamento;

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

    @Override
    public String toString() {
        return "Restaurante{" +
                "cnpj='" + cnpj + '\'' +
                ", nome='" + nome + '\'' +
                ", capacidade=" + capacidade +
                ", horarioFuncionamento='" + horarioFuncionamento + '\'' +
                '}';
    }
}
