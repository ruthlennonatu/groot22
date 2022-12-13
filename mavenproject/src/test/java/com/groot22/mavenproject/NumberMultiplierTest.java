package com.groot22.mavenproject;

import org.junit.Test;
import org.junit.Assert;


public class NumberMultiplierTest
{
	
	@Test
    public void testAdd() 
	{
        Assert.assertEquals(12.0,NumberMultiplier.multiply(2));
    }
	
	@Test
    public void testAdd2() 
	{
        Assert.assertEquals(42.0,DollarToEuro.exchange(7));
    }

}