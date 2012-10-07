package org.ryry.programming.tasks.recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibanocciTests {

	@Test
	public final void negativeNumberTest() {
		try {
			Fibanocci.getFibanocci(-1);
			fail("Expected an exception to be thrown");
		} catch (final Exception ex) {
			
		}
	}
	
	@Test
	public final void oneTest() {
		int f = Fibanocci.getFibanocci(1);
		assertEquals(1, f);
	}
	
	@Test
	public final void twoTest() {
		int f = Fibanocci.getFibanocci(2);
		assertEquals(1, f);
	}
	
	@Test
	public final void fiveTest() {
		int f = Fibanocci.getFibanocci(5);
		assertEquals(5, f);
	}
	
	@Test
	public final void tenTest() {
		int f = Fibanocci.getFibanocci(10);
		assertEquals(55, f);
	}
}
