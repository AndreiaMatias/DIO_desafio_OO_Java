package me.dio.models;

import me.dio.models.FuncionarioPJ;
import me.dio.models.calculaBonificacao;

public class Gerente extends FuncionarioPJ implements calculaBonificacao {
    private Double valorBonificacao;

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", documento='" + documento + '\'' +
                ", endereco=" + endereco +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", valorRemuneracao=" + valorRemuneracao +
                ", valorBonificacao=" + valorBonificacao +
                '}';
    }

    @Override
    public void calculaBonificacao(Double percentualBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (percentualBonificacao/100)) + 100d;
    }
}
