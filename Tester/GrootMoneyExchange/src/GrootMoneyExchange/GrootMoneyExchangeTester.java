package GrootMoneyExchange;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class GrootMoneyExchangeTester 
{
	
	@Test
    public void testAdd() 
	{
        Assert.assertEquals(0.97,DollarToEuro.exchange(1));
    }
	
	@Test
    public void testAdd2() 
	{
        Assert.assertEquals(97.00,DollarToEuro.exchange(100));
    }

}
