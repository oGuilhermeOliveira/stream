package br.com.guilhermeoli;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author guiol
 */
public class ExemplosCollect {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        List<Pessoa> listaBR = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList());
        listaBR.forEach(System.out::println);

        System.out.println("---------------");

        lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("---------------");

        Set<Pessoa> Set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toSet());
        Set.forEach(System.out::println);

        System.out.println("---------------");

        ArrayList<Pessoa> array = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"))
                .collect(Collectors.toCollection(ArrayList::new));
        array.forEach(System.out::println);

        System.out.println("---------------");

        Map<Integer, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.toMap(Pessoa::getIdade, Pessoa::new));
        map.forEach((k, v) -> System.out.println(v.getNome()));

        System.out.println("---------------");

        Map<Integer, List<Pessoa>> agrupaPorIdade = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Mexico"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));
        agrupaPorIdade.forEach((k, v) -> System.out.println(k + " / " + v));
    }
}
