/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: InputValidator.java
 * Description: This class validates the inputs for the drink selection, condiment selection and the number of units
 */
package edu.bu.met.cs665;
import java.util.Scanner;

public class InputValidator {
    private static final Scanner scanner = new Scanner(System.in);
    private static int wrongInputCount = 0;
    private static final int MAX_WRONG_INPUTS = 5;
    private static boolean hasMoreCondiments = true;


    private InputValidator() {}

//    public static int getIntInput(String prompt, int min, int max) {
//        int input;
//
//        do {
//            System.out.print(prompt);
//            while (!scanner.hasNextInt()) {
//                System.out.println("INVALID CHOICE! Please enter a number.");
//                System.out.print(prompt);
//                scanner.next();
//                incrementWrongInputCount();
//            }
//            input = scanner.nextInt();
//            if (input < min || input > max) {
//                System.out.println("INVALID CHOICE! Please enter a number between "+ min+" and "+ max+ ".");
//            }
//        } while (input < min || input > max || (input == 1 && !hasMoreCondiments));
//        if (max == 1 && input != 0) {
//            System.out.println("Too few condiments to choose from. Proceeding with the remaining condiment.");
//            hasMoreCondiments = false;
//        }
//        return input;
//    }
    public static int getIntInput(String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("INVALID CHOICE! Please enter a number.");
                System.out.print(prompt);
                scanner.next(); // Consume the non-integer input
                incrementWrongInputCount(); // Handle wrong input count
            }
            input = scanner.nextInt(); // Read the integer input
            if (input < min || input > max) {
                System.out.println("INVALID CHOICE! Please enter a number between " + min + " and " + max + ".");
            }
        } while (input < min || input > max);

        return input;
    }

    public static void closeScanner() {
        scanner.close();
    }
    private static void incrementWrongInputCount() {
        wrongInputCount++;
        if (wrongInputCount > MAX_WRONG_INPUTS && wrongInputCount <= MAX_WRONG_INPUTS) {
            System.out.println("Too many wrong inputs. Exiting program.");
            System.exit(0);
        }


    }
    private static void resetWrongInputCount() {
        wrongInputCount = 0;
    }

}

