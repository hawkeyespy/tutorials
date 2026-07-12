package com.rc.functional.solutions;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class Chapter02MethodReferencesSolution {
    public static void main(String[] args) {
        List<String> values = List.of("10", "25", "40");

        Function<String, Integer> parser = Integer::parseInt;
        Supplier<StringBuilder> builderFactory = StringBuilder::new;

        values.stream()
                .map(parser)
                .forEach(System.out::println);

        System.out.println(builderFactory.get().append("builder ready"));
    }
}
