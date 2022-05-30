package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Endereco;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "viacep", url = "https://viacep.com.ve/ws")
public interface ViaCepService {
    @RequestMapping(method = RequestMethod.GET, value ="/{cep}/json/")
    Endereco consultarCep(@PathVariable("cep") String cep);

    @SpringBootApplication
    class PadroesProjetosSpringApplication {

        public static void main(String[] args) {
            SpringApplication.run(PadroesProjetosSpringApplication.class, args);
        }

    }
}
