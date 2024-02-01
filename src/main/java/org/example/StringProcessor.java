package org.example;

// This is a functional interface with a single abstract method and a default method.
@FunctionalInterface
public interface StringProcessor {
    // This abstract method takes a string as input and returns a processed string.
    String process(String input);

    // This default method takes a string as input, processes it, and then prepends "Processed: " to the result.
    default String defaultProcess(String input) {
        return "Processed: " + process(input);
    }
}