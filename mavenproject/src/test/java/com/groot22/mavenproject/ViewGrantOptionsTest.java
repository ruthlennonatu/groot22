package com.groot22.mavenproject;

import org.junit.Assert;
import org.junit.Test;

public class ViewGrantOptionsTest {
	ViewGrantOptions viewGrant;
	/**
     * Rigorous Test :-)
     */
	@Test
	public void shouldAnswerOption1() {

		int input = 1;
		Assert.assertEquals("Icecap grant option worth $100", ViewGrantOptions.getOption(input));
	}

}