package ie.atu.testers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ie.atu.groot22;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;

class CustomerPaymentMethodsTest {
	CustomerPaymentMethods test;
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void test() {
		int input = 1;
		Assert.assertEquals("Credit Card Payment Selected", test.getPaymentOptions(input));
	}

}
