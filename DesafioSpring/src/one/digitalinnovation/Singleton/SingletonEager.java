package one.digitalinnovation.Singleton;
/**
    * Singleton "apressado"
    *
    * @author andreia
    */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }

}
