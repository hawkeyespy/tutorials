package com.rc.functional.practice;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Chapter02MethodReferencesPractice {
    public static void main(String[] args) {
        List<String> values = List.of("10", "25", "40");

        // TODO 1: Replace this lambda with a method reference.
        Function<String, Integer> parser = value -> Integer.parseInt(value);

        // TODO 2: Replace this lambda with a constructor reference.
        Supplier<StringBuilder> builderFactory = () -> new StringBuilder();

        values.stream()
                .map(parser)
                .forEach(System.out::println);

        System.out.println(builderFactory.get().append("builder ready"));
    }
}
