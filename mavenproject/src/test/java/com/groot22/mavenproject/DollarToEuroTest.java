package com.groot22.mavenproject;

import org.junit.Test;
import org.junit.Assert;


public class DollarToEuroTest
{
	
	@Test
    public void testAdd() 
	{
        Assert.assertEquals(0.97,DollarToEuro.exchange(1),0.02);
    }
	
	@Test
    public void testAdd2() 
	{
        Assert.assertEquals(97.00,DollarToEuro.exchange(100),0.02);
    }
	
	@Test
    public void testAdd3() 
	{
        Assert.assertEquals(48.50,DollarToEuro.exchange(50),0.02);
    }

}
