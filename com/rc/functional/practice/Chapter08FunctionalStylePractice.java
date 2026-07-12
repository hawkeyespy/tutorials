package com.rc.functional.practice;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter08FunctionalStylePractice {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Read chapter", true, 20),
                new Task("Write practice", false, 45),
                new Task("Review solution", true, 30));

        // TODO 1: Create a Predicate<Task> for completed tasks.
        Predicate<Task> completed = task -> false;

        // TODO 2: Create a Function<Task, String> that formats "name (minutes min)".
        Function<Task, String> format = task -> task.name();

        // TODO 3: Build a list of formatted labels for completed tasks only.
        List<String> labels = tasks.stream()
                .map(format)
                .toList();

        System.out.println(labels);
    }

    record Task(String name, boolean done, int minutes) {
    }
}
