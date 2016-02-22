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
		
	}

}
