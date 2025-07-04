package com.example;

public class App {

    private static String unusedField = "I'm not used";   // PMD: UnusedPrivateField

    public static void main(String[] args) {

        // ✅ Confirmation Message
        System.out.println("✅ Deployment successful! Code with known issues is now running on EC2.");

        // SpotBugs: Potential null dereference
        Object obj = "dummy";  // ← FIXED to avoid crash
        System.out.println("Just printing object: " + obj.toString());

        // Checkstyle: multiple statements in one line
        int a = 5; int b = 10; System.out.println("Sum = " + (a + b));  // Checkstyle warning
    }
}

