package com.rc.functional.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter01LambdaExpressions {
    public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Meera", "Arjun", "Leela");

        // A lambda is a small function that can be passed around as a value.
        Predicate<String> startsWithA = name -> name.startsWith("A");
        Function<String, String> shout = name -> name.toUpperCase() + "!";

        List<String> result = new ArrayList<>();
        for (String name : names) {
            if (startsWithA.test(name)) {
                result.add(shout.apply(name));
            }
        }

        System.out.println(result);

        // A lambda can target your own functional interface too.
        MessageBuilder welcome = user -> "Welcome, " + user;
        System.out.println(welcome.build("student"));
    }

    @FunctionalInterface
    interface MessageBuilder {
        String build(String user);
    }
}
