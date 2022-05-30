package subsistema2.cep;

import one.digitalinnovation.Singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String CEP){
        return "Araraquara";
    }

    public String recuperarEstado(String CEP){
        return "Estado";
    }
}
