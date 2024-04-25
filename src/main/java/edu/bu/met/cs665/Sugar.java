/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Sugar.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

import java.util.Scanner;

public class Sugar implements Condiment {
    private double unitCost = 0.5;

    int units = 0;

    public int getUnits() {
        return units;
    }

    public void setUnits() {
        this.units = units;
    }


    @Override
    public String addCondiment(Price price, int units) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select condiment: 1. Sugar, 2. Milk");
        int condimentChoice = InputValidator.getIntInput("Enter your choice: ", 1, 2);

        String condimentName;
        if (condimentChoice == 1) {
            condimentName = "sugar";
        } else {
            condimentName = "milk";
        }
        if (price.getTotalCondimentUnits() + units <= 6) {
            price.addCondimentUnits(units);
            this.units += units;
            return "Added " + units + " units of sugar.";
        } else {
            return "Cannot add more than 6 units of condiments.";
        }
    }

    @Override
    public double condimentCost() {
        return units * unitCost;
    }
}
