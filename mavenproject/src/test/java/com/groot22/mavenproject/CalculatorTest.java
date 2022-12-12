package com.groot22.mavenproject;

import org.junit.Test;
import org.junit.Assert;

/**
 * Unit test for calculator App.
 */

    


class CalculatorTest {

    /**
     * Testing of the multiplying methods in the calculator class :-)
     */


    

    @Test                                                 
    public void testMultiply() {
        Assert.assertEquals(20, Calculator.multiply(4, 5));  
                
    }
                                 
    @Test
    public void testMultiplyWithZero() {
        Assert.assertEquals(0, Calculator.multiply(0, 5));
        Assert.assertEquals(0, Calculator.multiply(5, 0));
    }
}