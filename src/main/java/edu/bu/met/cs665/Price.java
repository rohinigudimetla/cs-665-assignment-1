/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Price.java
 * Description: This class calculates the price of the condiments in total
 */

package edu.bu.met.cs665;

import java.util.HashMap;
import java.util.Map;

public class Price {

    private String name;
    private double price;
    private int totalCondimentUnits;

    private Map<String, Condiment> condiments;

    public Price(String name, double price) {
        this.name = name;
        this.price = price;
        this.totalCondimentUnits = 0;
        this.condiments = new HashMap<>();
        // Add initial strategies for available condiments
        this.condiments.put("milk", new Milk());
        this.condiments.put("sugar", new Sugar());
        // ... add other condiments
    }

    public void addCondiment(String condimentName, int units) {
        Condiment strategy = condiments.get(condimentName);
        if (strategy != null) {
            String message = strategy.addCondiment(this, units);
            System.out.println(message);
        } else {
            System.out.println("Condiment not available.");
        }
    }

    // Getter for totalCondimentUnits
    public int getTotalCondimentUnits() {
        return totalCondimentUnits;
    }

    // Method to add units to totalCondimentUnits
    public void addCondimentUnits(int units) {
        totalCondimentUnits += units;
    }

    public double calculateTotalPrice() {
        double totalPrice = price;
        for (Condiment condiment : condiments.values()) {
            totalPrice += condiment.condimentCost();
        }
        return totalPrice;
    }
}

