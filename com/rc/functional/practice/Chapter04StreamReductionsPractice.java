package com.rc.functional.practice;

import java.util.List;

public class Chapter04StreamReductionsPractice {
    public static void main(String[] args) {
        List<Integer> prices = List.of(100, 250, 75, 400);

        // TODO 1: Count prices greater than or equal to 100.
        long count = 0;

        // TODO 2: Find the total price with reduce.
        int total = 0;

        // TODO 3: Find the largest price safely.
        int largest = 0;

        System.out.println("Count: " + count);
        System.out.println("Total: " + total);
        System.out.println("Largest: " + largest);
    }
}
