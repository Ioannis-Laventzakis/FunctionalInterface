package org.example;

@FunctionalInterface
public interface StringProcessor {
    String process(String input);

    default String defaultProcess(String input) {
        return "Processed: " + process(input);
    }
}