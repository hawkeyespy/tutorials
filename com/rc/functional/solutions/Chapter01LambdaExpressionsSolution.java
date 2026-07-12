package com.rc.functional.solutions;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter01LambdaExpressionsSolution {
    public static void main(String[] args) {
        List<String> words = List.of("java", "lambda", "api", "stream");

        Predicate<String> longerThanFour = word -> word.length() > 4;
        Function<String, String> titleCase = word -> word.substring(0, 1).toUpperCase() + word.substring(1);

        words.stream()
                .filter(longerThanFour)
                .map(titleCase)
                .forEach(System.out::println);
    }
}
