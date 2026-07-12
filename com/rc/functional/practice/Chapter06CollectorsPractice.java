package com.rc.functional.practice;

import java.util.List;
import java.util.Map;

public class Chapter06CollectorsPractice {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ravi", "Java", 82),
                new Student("Meera", "Java", 91),
                new Student("Arjun", "SQL", 76));

        // TODO 1: Group students by course.
        Map<String, List<Student>> byCourse = Map.of();

        // TODO 2: Join all student names with comma separators.
        String names = "";

        System.out.println(byCourse);
        System.out.println(names);
    }

    record Student(String name, String course, int score) {
    }
}
