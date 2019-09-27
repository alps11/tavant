package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarkValidatorSwitchTest {

	@Test
	void testMarkGrade() {
		MarkValidatorSwitch markvalidatorswitch= new MarkValidatorSwitch();
		String actual= markvalidatorswitch.markGrade(95);
		String expected="Grade A";
		assertEquals(expected,actual);
		
	}

}
