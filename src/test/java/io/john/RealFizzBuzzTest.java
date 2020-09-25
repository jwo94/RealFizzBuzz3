package io.john;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RealFizzBuzzTest {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		
	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	@BeforeEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	
	@Test
	void test0() {
		RealFizzBuzz.computeFizzBuzz(0);
		assertEquals("fizz: 0\r\n" + 
				"buzz: 0\r\n" + 
				"fizzbuzz: 0\r\n" + 
				"lucky: 0\r\n" + 
				"integer: 0\r\n", outputStreamCaptor.toString());
	}
	
	@Test
	void test1() {
		RealFizzBuzz.computeFizzBuzz(1);
		assertEquals("1\r\nfizz: 0\r\n" + 
				"buzz: 0\r\n" + 
				"fizzbuzz: 0\r\n" + 
				"lucky: 0\r\n" + 
				"integer: 1\r\n", outputStreamCaptor.toString());
	}
	
	@Test
	void test35() {
			RealFizzBuzz.computeFizzBuzz(20);
			assertEquals("1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz\r\n" +
					"fizz: 4\r\n" +
					"buzz: 3\r\n" + 
					"fizzbuzz: 1\r\n" + 
					"lucky: 2\r\n" + 
					"integer: 10\r\n", outputStreamCaptor.toString());
	}
	
}
