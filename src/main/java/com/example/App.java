package com.example;

public class App {

    private static String unusedField = "I'm not used"; // PMD: UnusedPrivateField

    public static void main(String[] args) {
        Object obj = null;
        System.out.println(obj.toString()); // SpotBugs: NP_NULL_ON_SOME_PATH

        int a=5;int b=10;System.out.println(a+b); // Checkstyle: Multiple statements on one line
    }
}

