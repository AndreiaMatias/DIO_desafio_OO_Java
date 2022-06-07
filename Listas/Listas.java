import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listas {

    public static void main(String[] args) {
        //Crie uma lista. Adicione 5 nomes: Juliana, Pedro, Carlos, Larissa e João
        List<String> lista = new ArrayList<>();
        lista.add("Juliana");
        lista.add("Pedro");
        lista.add("Carlos");
        lista.add("Larissa");
        lista.add("João");

        System.out.println(lista);

        //Navegue na lista exibindo cada nome no console.
        for (String item : lista) {
            System.out.println(item);
        }

        //Substitua o nome Carlos por Roberto.
        lista.set(2, "Roberto");

        //Retorne o nome da posição 1
        lista.get(1);
        //Remova o nome da posição 4
        lista.remove(4);
        System.out.println(lista);
        //Remova o nome João
        lista.remove("João");
        //Retorne a quantidade de itens na lista
        System.out.println(lista.size());

        //Verifique se o nome Juliano existe na lista
        System.out.println(lista.contains("Juliano"));
        /*Crie uma nova lista com os nomes Ismael e Rodrigo. Adicione todos os
        itens da nova lista na primeira lista criada.*/
        List<String> lista2 = new ArrayList<>();
        lista2.add("Ismael");
        lista2.add("Rodrigo");
        lista2.addAll(lista);
        //Ordene os itens da lista por ordem alfabética
        Collections.sort(lista2);
        System.out.println(lista2);
        //Verifique se a lista está vazia.
        System.out.println(lista2.isEmpty());
    }
}