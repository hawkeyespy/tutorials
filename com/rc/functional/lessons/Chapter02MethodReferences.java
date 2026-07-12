package com.rc.functional.lessons;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Chapter02MethodReferences {
    public static void main(String[] args) {
        List<String> words = List.of("lambda", "stream", "optional");

        // Method reference for an existing instance method.
        words.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Constructor reference: Supplier asks for a value, StringBuilder::new creates one.
        Supplier<StringBuilder> builderFactory = StringBuilder::new;
        StringBuilder builder = builderFactory.get();
        builder.append("Created with a constructor reference");
        System.out.println(builder);

        // ClassName::instanceMethod is useful when the object arrives as the first argument.
        Function<String, Integer> lengthFinder = String::length;
        System.out.println(lengthFinder.apply("functional"));
    }
}
