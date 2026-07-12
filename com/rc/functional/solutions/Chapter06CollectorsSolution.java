package com.rc.functional.solutions;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter06CollectorsSolution {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Ravi", "Java", 82),
                new Student("Meera", "Java", 91),
                new Student("Arjun", "SQL", 76));

        Map<String, List<Student>> byCourse = students.stream()
                .collect(Collectors.groupingBy(Student::course));

        String names = students.stream()
                .map(Student::name)
                .collect(Collectors.joining(", "));

        System.out.println(byCourse);
        System.out.println(names);
    }

    record Student(String name, String course, int score) {
    }
}
