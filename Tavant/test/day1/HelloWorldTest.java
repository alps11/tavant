package day1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

	@Test
	void test() {
		HelloWorld Helloworld=new HelloWorld();
		String output=Helloworld.getMessage();
		assertEquals("Hello world",output);
	}

}
