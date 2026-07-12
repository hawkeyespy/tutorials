package com.rc.functional.lessons;

import java.util.Comparator;
import java.util.List;

public class Chapter04StreamReductions {
    public static void main(String[] args) {
        List<Integer> scores = List.of(72, 88, 91, 64, 95);

        long passingCount = scores.stream()
                .filter(score -> score >= 70)
                .count();

        int total = scores.stream()
                .reduce(0, Integer::sum);

        int highest = scores.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);

        System.out.println("Passing count: " + passingCount);
        System.out.println("Total: " + total);
        System.out.println("Highest: " + highest);

        String sentence = List.of("streams", "make", "pipelines")
                .stream()
                .reduce("", (left, right) -> left.isEmpty() ? right : left + " " + right);

        System.out.println(sentence);
    }
}
