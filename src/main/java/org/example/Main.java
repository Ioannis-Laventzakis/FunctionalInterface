package org.example;

public class Main {
    public static void main(String[] args) {
        StringProcessor toUpperCaseProcessor = String::toUpperCase;
        StringProcessor reverseProcessor = str -> new StringBuilder(str).reverse().toString();

        String testString = "Hello World";

        System.out.println("Original String: " + testString);
        System.out.println("Uppercase: " + toUpperCaseProcessor.process(testString));
        System.out.println("Reversed: " + reverseProcessor.process(testString));

        System.out.println("Uppercase (Default Process): " + toUpperCaseProcessor.defaultProcess(testString));
        System.out.println("Reversed (Default Process): " + reverseProcessor.defaultProcess(testString));
    }
}