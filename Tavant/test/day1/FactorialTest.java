package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testCalculateFactorial() {
		Factorial factorial= new Factorial();
		int number=5;
		int actual= factorial.calculateFactorial(number);
		int expected =120;
		assertEquals(actual,expected);
	}

}
