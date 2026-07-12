package com.rc.functional.solutions;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter08FunctionalStyleSolution {
    public static void main(String[] args) {
        List<Task> tasks = List.of(
                new Task("Read chapter", true, 20),
                new Task("Write practice", false, 45),
                new Task("Review solution", true, 30));

        Predicate<Task> completed = Task::done;
        Function<Task, String> format = task -> task.name() + " (" + task.minutes() + " min)";

        List<String> labels = tasks.stream()
                .filter(completed)
                .map(format)
                .toList();

        System.out.println(labels);
    }

    record Task(String name, boolean done, int minutes) {
    }
}
