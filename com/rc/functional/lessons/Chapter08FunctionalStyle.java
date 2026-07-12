package com.rc.functional.lessons;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Chapter08FunctionalStyle {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("book", 2, 500),
                new Order("pen", 10, 20),
                new Order("desk", 1, 7000));

        Predicate<Order> expensive = order -> order.total() >= 1000;
        Function<Order, String> label = order -> order.item() + " = " + order.total();

        // Prefer returning new values from a pipeline instead of changing outside variables.
        List<String> expensiveOrderLabels = orders.stream()
                .filter(expensive)
                .map(label)
                .toList();

        System.out.println(expensiveOrderLabels);
    }

    record Order(String item, int quantity, int unitPrice) {
        int total() {
            return quantity * unitPrice;
        }
    }
}
