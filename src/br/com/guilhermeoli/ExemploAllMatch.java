package br.com.guilhermeoli;

import java.util.List;

/**
 * @author guiol
 */
public class ExemploAllMatch {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        boolean result =  lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Mexico"));

        System.out.println(result);
    }
}
