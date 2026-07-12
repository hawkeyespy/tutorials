package com.rc.functional.practice;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter01LambdaExpressionsPractice {
    public static void main(String[] args) {
        List<String> words = List.of("java", "lambda", "api", "stream");

        // TODO 1: Create a Predicate<String> named longerThanFour that returns true for words longer than 4 letters.
        Predicate<String> longerThanFour = word -> false;

        // TODO 2: Create a Function<String, String> named titleCase that uppercases the first letter.
        Function<String, String> titleCase = word -> word;

        // TODO 3: Print only matching words after applying titleCase.
        words.forEach(System.out::println);
    }
}
