package br.com.guilhermeoli;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author guiol
 */
public class CriandoStreams {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Steve Harris", "Bruce Dickson");

        Stream<String> set = Set.of("Steve Harris", "Bruce Dickson").stream();

        Map<String, String> map = Map.of("Steve Harris", "Bruce Dickson");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();

        Stream<String> streamSt = Stream.of("String", "asdasda");
    }
}
