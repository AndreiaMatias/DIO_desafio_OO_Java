package me.dio;

import me.dio.models.Endereco;
import me.dio.models.Gerente;
import me.dio.models.OperadorDeCaixa;
import me.dio.models.Vendedor;

public class Main {

    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos Trilhos");
        endereco.setComplemento("0");
        endereco.setBairro("Vila Ninguém");

        System.out.println(endereco.getRua() + ", " + endereco.getComplemento() + ", " + endereco.getBairro());

        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Andreia");
        vendedor.setDocumento("123.456.789-00");
        vendedor.setSalario(5000d);
        vendedor.setEndereco(endereco);

        System.out.println(vendedor.getNome());
        System.out.println(vendedor.getDocumento());
        System.out.println(vendedor.getSalario());
        System.out.println(vendedor.getEndereco());

        OperadorDeCaixa caixa = new OperadorDeCaixa("Fernando", "123565478-99", 2000d, endereco);

        Gerente gerente = new Gerente();
        gerente.setNome("Andreia Gerente");
        gerente.setDocumento("999999999-99");
        gerente.setEndereco(endereco);
        gerente.setHorasTrabalhadas(20);
        gerente.setValorHora(100d);
        gerente.calculaRemuneracao();
        gerente.calculaBonificacao(0.05);

        System.out.println(gerente);

    }
}