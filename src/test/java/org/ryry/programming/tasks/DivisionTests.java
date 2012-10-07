package org.ryry.programming.tasks;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ryry.programming.tasks.Division.Quotient;

public class DivisionTests {

	@Test
	public final void divideByZeroTest() {
		Quotient q = Division.divide(67, 0);
		assertNull(q);
	}
	
	@Test
	public final void nonDivisibleTest() {
		Quotient q = Division.divide(3, 5);
		assertNotNull(q);
		assertEquals(0, q.getQuotient());
		assertEquals(3, q.getRemainder());
	}
	
	@Test
	public final void evenlyDivisibleTest() {
		Quotient q = Division.divide(300, 2);
		assertNotNull(q);
		assertEquals(150, q.getQuotient());
		assertEquals(0, q.getRemainder());
	}
	
	@Test
	public final void remainderTest() {
		Quotient q = Division.divide(31, 2);
		assertNotNull(q);
		assertEquals(15, q.getQuotient());
		assertEquals(1, q.getRemainder());
	}
	
	@Test
	public final void negativeDivisorTest() {
		Quotient q = Division.divide(31, -2);
		assertNotNull(q);
		assertEquals(15, q.getQuotient());
		assertEquals(1, q.getRemainder());
	}
	
	@Test
	public final void negativeDividendTest() {
		Quotient q = Division.divide(-45, 2);
		assertNotNull(q);
		assertEquals(22, q.getQuotient());
		assertEquals(1, q.getRemainder());
	}
	
	@Test
	public final void bothNegativeTest() {
		Quotient q = Division.divide(-99, -8);
		assertNotNull(q);
		assertEquals(12, q.getQuotient());
		assertEquals(3, q.getRemainder());
	}
	
}
