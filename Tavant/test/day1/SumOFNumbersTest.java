package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumOFNumbersTest {

	@Test
	void testSumOfEvenNumbers() {
		SumOfNumbers sumofnumbers=new SumOfNumbers();
		int firstnumber=1;
		int secondnumber=10;
		int sumofeven= sumofnumbers.sumOfEvenNumbers(firstnumber, secondnumber);
		assertEquals(30,sumofeven);
		
	}

	@Test
	void testSumOfOddNumbers() {
		SumOfNumbers sumofnumbers= new SumOfNumbers();
		int firstnumber=1;
		int secondnumber=10;
		int sumofodd=sumofnumbers.sumOfOddNumbers(firstnumber, secondnumber);
		assertEquals(25,sumofodd);
	}

}
