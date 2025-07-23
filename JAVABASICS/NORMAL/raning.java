package JAVABASICS.NORMAL;

import java.util.Scanner;

class KeepRunningExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Your logic here
            System.out.println("Enter a number (or type 'exit' to quit):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting program...");
                break; // Exit the loop
            }

            try {
                int number = Integer.parseInt(input);
                System.out.println("You entered: " + number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'exit'.");
            }

            System.out.println(); // Adds an empty line for readability
        }

        scanner.close();
    }
}
