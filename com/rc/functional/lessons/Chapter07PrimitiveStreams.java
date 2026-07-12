package com.rc.functional.lessons;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;

public class Chapter07PrimitiveStreams {
    public static void main(String[] args) {
        int sumOfSquares = IntStream.rangeClosed(1, 5)
                .map(number -> number * number)
                .sum();

        System.out.println("Sum of squares: " + sumOfSquares);

        List<String> words = List.of("lambda", "stream", "collector");
        IntSummaryStatistics stats = words.stream()
                .mapToInt(String::length)
                .summaryStatistics();

        System.out.println("Shortest word length: " + stats.getMin());
        System.out.println("Longest word length: " + stats.getMax());
        System.out.println("Average word length: " + stats.getAverage());
    }
}
