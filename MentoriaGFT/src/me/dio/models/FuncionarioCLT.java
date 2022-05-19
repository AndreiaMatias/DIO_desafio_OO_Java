package me.dio.models;

import me.dio.models.Endereco;

public abstract class FuncionarioCLT {
    protected String nome;
    protected String documento;
    protected Double salario;
    private Endereco endereco;

    public FuncionarioCLT() {
    }

    public FuncionarioCLT(String nome, String documento, Double salario, Endereco endereco) {
        this.nome = nome;
        this.documento = documento;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
