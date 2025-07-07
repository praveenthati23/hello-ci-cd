package com.example;

public class App {

    private static String unusedField = "I'm not used";   // PMD: UnusedPrivateField

    public static void main(String[] args) {

        // ✅ Confirmation Message
        System.out.println("✅ Deployment successful! Code with known issues is now running on EC2.");

        // SpotBugs: Null pointer dereference (causes build to fail if failOnError=true)
        String risky = null;
        System.out.println("Length: " + risky.length());  // 🔥 This line will cause SpotBugs error NP_NULL_DEREFERENCE

        // Checkstyle: multiple statements in one line
        int a = 5; int b = 10; System.out.println("Sum = " + (a + b));  // Checkstyle warning
    }
}

