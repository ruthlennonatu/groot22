package com.groot22.mavenproject;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class DollarToPoundTest
{
	
 	@Test
     public void testAdd() 
 	{
         Assert.assertEquals(0.82,DollarToPound.exchange(1),0.02); // 0.02 floating point error fix
     }

}
