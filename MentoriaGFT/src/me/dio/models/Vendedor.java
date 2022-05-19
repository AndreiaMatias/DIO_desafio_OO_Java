package me.dio.models;

import me.dio.models.FuncionarioCLT;
import me.dio.models.calculaBonificacao;

public class Vendedor extends FuncionarioCLT implements calculaBonificacao {

    private Double valorDaBonificacao;
    @Override
    public String toString() {
        return "Vendedor{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", salario=" + salario +
                ", endereco=" + getEndereco() +
                '}';
    }

    @Override
    public void calculaBonificacao(Double percentualBonificacao) {
        this.valorDaBonificacao = (super.getSalario() * (percentualBonificacao/100)) + 100d;
    }
}
