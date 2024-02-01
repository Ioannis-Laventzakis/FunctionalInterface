package org.example;

public class Main {
    public static void main(String[] args) {
        // Create a StringProcessor that converts strings to uppercase.
        StringProcessor toUpperCaseProcessor = String::toUpperCase;
        // Create a StringProcessor that reverses strings.
        StringProcessor reverseProcessor = str -> new StringBuilder(str).reverse().toString();

        // The string we will be processing.
        String testString = "Hello World";

        // Print the original string.
        System.out.println("Original String: " + testString);
        // Convert the string to uppercase and print the result.
        System.out.println("Uppercase: " + toUpperCaseProcessor.process(testString));
        // Reverse the string and print the result.
        System.out.println("Reversed: " + reverseProcessor.process(testString));

        // Convert the string to uppercase using the default process method and print the result.
        System.out.println("Uppercase (Default Process): " + toUpperCaseProcessor.defaultProcess(testString));
        // Reverse the string using the default process method and print the result.
        System.out.println("Reversed (Default Process): " + reverseProcessor.defaultProcess(testString));
    }
}