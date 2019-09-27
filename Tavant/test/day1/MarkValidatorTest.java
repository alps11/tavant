package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorTest {

	@Test
	void testisPass() {
		MarkValidator markvalidator= new MarkValidator();
		boolean actual =markvalidator.isPass(55);
		boolean expected=true;
		assertEquals(expected,actual);
	}
	@Test
	void testmarkGrade() {
		MarkValidator markvalidator= new MarkValidator();
		String actual=markvalidator.markGrade(65);
		String expected= "Grade C";
		assertEquals(expected,actual);
	}

}
