package ie.atu.testers;
import static org.junit.jupiter.api.Assertions.*;
import ie.atu.groot22;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ViewGrantOptionsTest {
	ViewGrantOptions viewGrant;
	@BeforeEach
	public void setUp() throws Exception {
		viewGrant.getOption(1);
	}

	@Test
	void testViewOption() {
		int input = 1;
		Assert.assertEquals("Icecap grant option worth $100", viewGrant.getOption(input));
	}

}
