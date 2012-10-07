package org.ryry.programming.tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberFinderTests {

	@Test
	public final void zeroTest() {
		assertFalse(PrimeNumberFinder.isPrime(0));
	}
	
	@Test
	public final void  negativeTest() {
		assertFalse(PrimeNumberFinder.isPrime(-5));
	}
	
	@Test
	public final void nonPrimeTest() {
		assertFalse(PrimeNumberFinder.isPrime(44));
	}
	
	@Test
	public final void primeTest() {
		assertTrue(PrimeNumberFinder.isPrime(47));
	}
}
