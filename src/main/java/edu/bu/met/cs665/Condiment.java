/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Condiment.java
 * Description: This is the interface for the condiments
 */

package edu.bu.met.cs665;

public interface Condiment {
    String addCondiment(Price beverage, int units);
    double condimentCost();

}
