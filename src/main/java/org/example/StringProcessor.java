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

/*@FunctionalInterface: This is an annotation that indicates that an interface is a functional interface. This is not required, but it's good practice to use it for clarity.
String process(String input);: This is the single abstract method in the interface.
It takes a string as input and returns a processed string. The exact processing is not defined in the interface, but rather in the implementations of the interface.
default String defaultProcess(String input): This is a default method in the interface.
Default methods were introduced in Java 8 to allow developers to add new methods to interfaces without breaking existing implementations.
This method takes a string as input, processes it using the process method, and then prepends "Processed: " to the result.*/