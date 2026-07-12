package com.rc.functional.practice;

import java.util.List;
import java.util.Optional;

public class Chapter05OptionalPractice {
    public static void main(String[] args) {
        List<String> cities = List.of("Chennai", "Bengaluru", "Hyderabad");

        // TODO 1: Find the first city that starts with "B".
        Optional<String> city = Optional.empty();

        // TODO 2: Print the city in uppercase if it exists.

        // TODO 3: Build a fallback value using orElse.
        String result = city.orElse("not found");

        System.out.println(result);
    }
}
