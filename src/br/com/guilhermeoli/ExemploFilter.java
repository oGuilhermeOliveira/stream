package br.com.guilhermeoli;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author guiol
 */
public class ExemploFilter {

    public static void main(String[] args) {

            List<Pessoa> pessoas = new Pessoa().populaPessoas();

            Stream<Pessoa> stream = pessoas.stream()
                    .filter(pessoa -> pessoa.getNacionalidade().equals("Brasil"));

            Predicate<Pessoa> predi = pessoa -> pessoa.getNacionalidade().equals("Brasil");
            Stream stream1 = pessoas.stream().filter(predi);

            Predicate<Pessoa> predi1 = new Predicate<Pessoa>() {
                @Override
                public boolean test(Pessoa pessoa) {
                    return pessoa.getNacionalidade().equals("Brasil");
                }
            };
            Stream stream2 = pessoas.stream().filter(predi1);

    }


    }

