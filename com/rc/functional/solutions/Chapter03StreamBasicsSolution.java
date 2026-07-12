package com.rc.functional.solutions;

import java.util.List;

public class Chapter03StreamBasicsSolution {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 6, 7, 8);

        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * 10)
                .toList();

        System.out.println(result);
    }
}
