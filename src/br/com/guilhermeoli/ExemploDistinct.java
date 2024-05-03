package br.com.guilhermeoli;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author guiol
 */
public class ExemploDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
