package com.rc.functional.practice;

import java.util.IntSummaryStatistics;
import java.util.List;

public class Chapter07PrimitiveStreamsPractice {
    public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Meera", "Arjun", "Leela");

        // TODO 1: Convert names to an IntStream of lengths.
        // TODO 2: Use summaryStatistics to get min, max, average, and count.
        IntSummaryStatistics statistics = new IntSummaryStatistics();

        System.out.println(statistics);
    }
}
