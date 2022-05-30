package one.digitalinnovation;

import one.digitalinnovation.Facade.Facade;
import one.digitalinnovation.Singleton.SingletonEager;
import one.digitalinnovation.Singleton.SingletonLazy;
import one.digitalinnovation.Strategy.*;

public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo=new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Andreia","123456789");


    }
}
