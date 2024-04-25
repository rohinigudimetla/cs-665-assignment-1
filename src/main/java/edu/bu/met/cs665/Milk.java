/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Milk.java
 * Description: Write a description for this class
 */

package edu.bu.met.cs665;

public class Milk implements Condiment {
    private double unitCost = 0.5;
    private int units = 0;

    // Getter method for units
    public int getUnits() {
        return units;
    }

    // Setter method for units
    public void setUnits(int units) {
        this.units = units;
    }

    @Override
    public String addCondiment(Price price, int units) {
        if (price.getTotalCondimentUnits() + units <= 6) {
            price.addCondimentUnits(units);
            this.units += units;
            return "Added " + units + " units of milk.";
        } else {
            return "Cannot add more than 6 units of condiments.";
        }
    }

    @Override
    public double condimentCost() {
        return units * unitCost;
    }
}
