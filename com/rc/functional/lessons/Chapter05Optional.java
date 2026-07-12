package com.rc.functional.lessons;

import java.util.List;
import java.util.Optional;

public class Chapter05Optional {
    public static void main(String[] args) {
        List<String> emails = List.of("admin@example.com", "student@example.com");

        Optional<String> adminEmail = emails.stream()
                .filter(email -> email.startsWith("admin"))
                .findFirst();

        adminEmail.ifPresent(email -> System.out.println("Found: " + email));

        String supportEmail = emails.stream()
                .filter(email -> email.startsWith("support"))
                .findFirst()
                .orElse("support is not configured");

        System.out.println(supportEmail);

        String domain = adminEmail
                .map(email -> email.substring(email.indexOf("@") + 1))
                .orElse("unknown");

        System.out.println("Domain: " + domain);
    }
}
