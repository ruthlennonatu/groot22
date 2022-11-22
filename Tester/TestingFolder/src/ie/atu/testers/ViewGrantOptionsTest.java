package ie.atu.testers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ie.atu.groot22.ViewGrantOptions;

class ViewGrantOptionsTest {
	ViewGrantOptions viewGrant;
	@BeforeEach
	void setUp() throws Exception {
		viewGrant.getOption(1);
	}

	@Test
	void test() {
		int input = 1;
		Assert.assertEquals("Icecap grant option worth $100", viewGrant.getOption(input));
	}

}
