import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateTest {

	Calculate calculation = new Calculate();
	Double sum = calculation.sum(20);
	Double testSum = 75.7;


	@Test
	public void testSum() {
		System.out.println("@Test sum(): " + sum + " = " + testSum);
		assertEquals(sum, testSum);
	}

}