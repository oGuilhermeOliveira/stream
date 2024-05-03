package br.com.guilhermeoli;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author guiol
 */
public class ExemploMap {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Integer> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .map(Pessoa::getIdade);

        IntStream stream1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .mapToInt(Pessoa::getIdade);
    }
}
