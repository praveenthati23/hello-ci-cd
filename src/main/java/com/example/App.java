package com.example;

public class App {

    private static String unusedField = "I'm not used";  // ❌ PMD: UnusedPrivateField

    public static void main(String[] args) {

        // ❌ SpotBugs: Null pointer dereference
        String name = null;
        System.out.println(name.length());  // SpotBugs should flag this

        // ❌ Checkstyle: Multiple statements per line and missing JavaDoc
        int a = 5; int b = 10; System.out.println("Sum = " + (a + b)); // Checkstyle violation
    }
}

