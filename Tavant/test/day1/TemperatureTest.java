package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperatureTest {
	
	//Temperature temperature = new Temperature();
	
	@Test
	void testconvertToFarenheit() {
		Temperature temperature = new Temperature();
		double celcius= 10;
		int farenheit =(int) temperature.convertToFarenheit(celcius);
		int expected= 50;
		assertEquals(farenheit,expected);
	}

	@Test 
	void testconvertToCelcius() {
		Temperature temperature = new Temperature();
		double farenheit= 68;
		int celcius=(int) temperature.convertToCelcius(farenheit);
		int expected= 20;
		assertEquals(celcius,expected);
	}

}


