package com.rc.functional.lessons;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Chapter06Collectors {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Ravi", "Engineering", 90000),
                new Employee("Meera", "Engineering", 95000),
                new Employee("Arjun", "Support", 70000),
                new Employee("Leela", "Support", 72000));

        Map<String, List<Employee>> byDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::department));

        Map<Boolean, List<Employee>> highEarners = employees.stream()
                .collect(Collectors.partitioningBy(employee -> employee.salary() >= 90000));

        String names = employees.stream()
                .map(Employee::name)
                .collect(Collectors.joining(", "));

        System.out.println(byDepartment);
        System.out.println(highEarners);
        System.out.println(names);
    }

    record Employee(String name, String department, int salary) {
    }
}
