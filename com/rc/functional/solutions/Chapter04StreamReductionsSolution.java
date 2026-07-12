package com.rc.functional.solutions;

import java.util.Comparator;
import java.util.List;

public class Chapter04StreamReductionsSolution {
    public static void main(String[] args) {
        List<Integer> prices = List.of(100, 250, 75, 400);

        long count = prices.stream()
                .filter(price -> price >= 100)
                .count();

        int total = prices.stream()
                .reduce(0, Integer::sum);

        int largest = prices.stream()
                .max(Comparator.naturalOrder())
                .orElse(0);

        System.out.println("Count: " + count);
        System.out.println("Total: " + total);
        System.out.println("Largest: " + largest);
    }
}
