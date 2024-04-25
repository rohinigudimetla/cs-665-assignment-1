/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Man.java
 * Description: Main class
 */
package edu.bu.met.cs665;

import java.util.Scanner;

import static edu.bu.met.cs665.InputValidator.getIntInput;

public class Main {
  public static void main(String[] args) {
    // Display menu options for selecting base drink (tea or coffee)
    System.out.println("Select a base drink:");
    System.out.println("1. Tea");
    System.out.println("2. Coffee");
    int baseDrinkChoice = getIntInput("Enter your choice: ", 1, 2);

    // Display menu options for selecting specific drink based on base drink
    System.out.println("\nSelect a specific drink:");
    switch (baseDrinkChoice) {
      case 1: // Tea
        System.out.println("1. Black Tea");
        System.out.println("2. Green Tea");
        System.out.println("3. Yellow Tea");
        break;
      case 2: // Coffee
        System.out.println("1. Espresso");
        System.out.println("2. Americano");
        System.out.println("3. Latte Macchiato");
        break;
    }
    int specificDrinkChoice = getIntInput("Enter your choice: ", 1, 3);


    System.out.println("\nYou selected:");
    switch (baseDrinkChoice) {
      case 1: // Tea
        switch (specificDrinkChoice) {
          case 1:
            System.out.println("Black Tea");
            break;
          case 2:
            System.out.println("Green Tea");
            break;
          case 3:
            System.out.println("Yellow Tea");
            break;
        }
        break;
      case 2: // Coffee
        switch (specificDrinkChoice) {
          case 1:
            System.out.println("Espresso");
            break;
          case 2:
            System.out.println("Americano");
            break;
          case 3:
            System.out.println("Latte Macchiato");
            break;
        }
        break;
    }

    // Prompt user to select condiment
//    System.out.println("\nSelect condiment:");
//    System.out.println("1. Sugar");
//    System.out.println("2. Milk");
//    int condimentChoice = InputValidator.getIntInput("Enter your choice: ", 1, 2);
//
//    // Prompt user to enter the number of units for the chosen condiment
//    int units = InputValidator.getIntInput("Enter number of units: ", 0, 3);
    System.out.println("\nSelect condiment:");
    System.out.println("0. None");
    System.out.println("1. Sugar");
    System.out.println("2. Milk");

    boolean selectingCondiments = true;
    int units = 0;
    while (selectingCondiments) {
      int condimentChoice = getIntInput("Enter your choice (or 0 to finish): ", 0, 2);
      if (condimentChoice == 0) {
        selectingCondiments = false; // Exit the loop if the user finishes selecting condiments
      } else {
        units += getIntInput("Enter units (1-3): ", 1, 3);
        System.out.println("You selected " + condimentChoice + " with " + units + " units.");

      }
    }
    System.out.println("Units:"+ units);
  }

    // Close the scanner
//    InputValidator.closeScanner();
  }
