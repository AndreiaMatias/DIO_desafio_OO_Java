package me.dio.models;

import me.dio.models.Endereco;
import me.dio.models.FuncionarioCLT;

public class OperadorDeCaixa extends FuncionarioCLT {

    public OperadorDeCaixa(String nome, String documento, Double salario, Endereco endereco) {
        super(nome, documento, salario, endereco);
    }

    public OperadorDeCaixa() {
    }

    @Override
    public String toString() {
        return "OperadorDeCaixa{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", salario=" + salario +
                ", endereco=" + getEndereco() +
                '}';
    }
}
