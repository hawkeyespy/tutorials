package com.rc.functional.solutions;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Chapter07PrimitiveStreamsSolution {
    public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Meera", "Arjun", "Leela");

        IntSummaryStatistics statistics = names.stream()
                .mapToInt(String::length)
                .summaryStatistics();

        System.out.println(statistics);
    }
}
