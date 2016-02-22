package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
public class CalculatorTest {
	private Calculator myCalculator;
	@Before
	public void setUp() throws Exception{
		myCalculator = new Calculator();
		
	}
	
	@After
	public void tearDown() throws Exception{
		myCalculator = null;
	}
	
	@Test
	public void testCalculator() {
		myCalculator = new Calculator();
		assertEquals(0, myCalculator.getTotal());
		assertEquals("0", myCalculator.getHistory());
	}
	
	@Test
	public void testGetTotal() {
		myCalculator = new Calculator();
		assertEquals(0, myCalculator.getTotal());
	}
	
	@Test
	public void testAdd(){
		myCalculator = new Calculator();
		myCalculator.add(4);
		assertEquals(4, myCalculator.getTotal());
	}
	
	@Test
	public void testSubtract() {
		myCalculator = new Calculator();
		myCalculator.subtract(4);
		assertEquals(-4, myCalculator.getTotal());
		
	}
	
	@Test
	public void testMultiply() {
		myCalculator = new Calculator();
		myCalculator.multiply(4);
		assertEquals(0, myCalculator.getTotal());
		
	}
	
	@Test
	public void testDivide() {
		myCalculator = new Calculator();
		myCalculator.divide(3);
		assertEquals(0, myCalculator.getTotal());
		
	}
	
	@Test
	public void testGetHistory() {
		myCalculator = new Calculator();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		assertEquals(9, myCalculator.getTotal());
		assertEquals("0 + 4 - 2 * 2 + 5", myCalculator.getHistory());
		
	}

}
