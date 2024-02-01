# String Processor Project

This project demonstrates the use of functional interfaces and lambda expressions in Java.

## Project Structure

The project contains two main files:

- `src/main/java/org/example/StringProcessor.java`: This file defines a functional interface named `StringProcessor` with an abstract method `String process(String input);` and a default method named `defaultProcess` that appends "Processed:" to the result of the `process` method.

- `src/main/java/org/example/Main.java`: This file contains the `main` method where we create instances of `StringProcessor` using lambda expressions for two operations: converting a string to uppercase and reversing a string. We then test these implementations by applying both operations to a string and printing the results.

## Running the Project

To run the project, navigate to the project directory and execute the following command:

```bash
mvn clean install
java -cp target/my-app-1.0-SNAPSHOT.jar org.example.Main