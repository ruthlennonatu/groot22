package com.groot22.mavenproject;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for calculator App.
 */

    


public class CalculatorTest {

    /**
     * Testing of the multiplying methods in the calculator class :-)
     */


    

    @Test                                                 
    public void testMultiply() {
        Assert.assertEquals(20, Calculator.multiply(4, 5),0.02);  
                
    }
                                 
    @Test
    public void testMultiplyWithZero() {
        Assert.assertEquals(0, Calculator.multiply(0, 5),0.02);
        Assert.assertEquals(0, Calculator.multiply(5, 0),0.02);
    }
}
