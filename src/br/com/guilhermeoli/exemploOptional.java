package br.com.guilhermeoli;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * @author guiol
 */
public class exemploOptional {
    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().populaPessoas();

        Optional<Pessoa> opcional = lista.stream()
                .max(Comparator.comparing(Pessoa::getIdade));

        if (opcional.isPresent()) {
            System.out.println(opcional.get());
        }

        opcional.ifPresent(System.out::println);

        Optional<Pessoa> min = lista.stream()
                .min(Comparator.comparing(Pessoa::getIdade));

        min.ifPresentOrElse(System.out::println, new Runnable() {
            @Override
            public void run() {
                //
            }
        });
        Pessoa value = min.orElseThrow();
    }
}
