package com.rc.functional.practice;

import java.util.List;

public class Chapter03StreamBasicsPractice {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 4, 5, 6, 7, 8);

        // TODO: Create a stream that keeps odd numbers, multiplies each by 10, and collects to a list.
        List<Integer> result = numbers;

        System.out.println(result);
    }
}
