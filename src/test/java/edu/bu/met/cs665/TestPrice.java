/**
 * Name: ROHINI GUDIMETLA
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: TestBeverage.java
 * Description: Tests
 */

package edu.bu.met.cs665;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestPrice {
    @Test
    public void testAddCondiment() {
        Price price = new Price("Coffee", 2.0);
        price.addCondiment("milk", 1);
        assertEquals(2, price.getTotalCondimentUnits());
    }
    @Test
    public void testAddCondiment2() {
        Price price = new Price("Tea", 2.0);
        price.addCondiment("sugar", 2);
        assertEquals(2, price.getTotalCondimentUnits());
    }
    @Test
    public void testAddCondiment3() {
        Price price = new Price("Coffee", 2.0);
        price.addCondiment("sugar", 3);
        assertEquals(2, price.getTotalCondimentUnits());
    }
}
