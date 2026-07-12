package com.rc.functional.solutions;

import java.util.List;
import java.util.Optional;

public class Chapter05OptionalSolution {
    public static void main(String[] args) {
        List<String> cities = List.of("Chennai", "Bengaluru", "Hyderabad");

        Optional<String> city = cities.stream()
                .filter(value -> value.startsWith("B"))
                .findFirst();

        city.map(String::toUpperCase)
                .ifPresent(System.out::println);

        String result = city.orElse("not found");

        System.out.println(result);
    }
}
