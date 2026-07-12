package com.rc.functional.lessons;

import java.util.List;

public class Chapter03StreamBasics {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 5, 8, 11, 14, 17);

        // A stream pipeline usually has a source, intermediate operations, and a terminal operation.
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);

        List<String> names = List.of("ravi", "meera", "arjun");
        List<String> capitalized = names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .toList();

        System.out.println(capitalized);
    }
}
