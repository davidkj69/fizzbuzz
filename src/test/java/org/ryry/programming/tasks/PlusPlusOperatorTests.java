package org.ryry.programming.tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlusPlusOperatorTests {

	
	@Test
	public final void nullTest() {
		int[] a = null;
		int[] result = PlusPlusOperator.plusPlus(a);
		assertNull(result);
	}
	
	@Test
	public final void oneDigitNoCarry() {
		int[] a = {5};
		int[] result = PlusPlusOperator.plusPlus(a);
		assertEquals(1, result.length);
		assertEquals(6, result[0]);
	}
	
	@Test
	public final void twoDigitNoCarry() {
		int[] a = {6, 2};
		int[] result = PlusPlusOperator.plusPlus(a);
		assertEquals(2, result.length);
		assertEquals(6, result[0]);
		assertEquals(3, result[1]);
	}
	
	@Test
	public final void threeDigitsCarry() {
		int[] a = {9,9,9};
		int[] result = PlusPlusOperator.plusPlus(a);
		assertEquals(4, result.length);
		assertEquals(1, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
	}
	
	@Test
	public final void carryHalfway() {
		int[] a = {5,9,9,9};
		int[] result = PlusPlusOperator.plusPlus(a);
		assertEquals(4, result.length);
		assertEquals(6, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
	}
	
	@Test
	public final void tenDigitCarry() {
		int[] a = {9,9,9,9,9,9,9,9,9,9};
		int[] result = PlusPlusOperator.plusPlus(a);
		assertEquals(11, result.length);
		assertEquals(1, result[0]);
		assertEquals(0, result[1]);
		assertEquals(0, result[2]);
		assertEquals(0, result[3]);
		assertEquals(0, result[4]);
		assertEquals(0, result[5]);
		assertEquals(0, result[6]);
		assertEquals(0, result[7]);
		assertEquals(0, result[8]);
		assertEquals(0, result[9]);
		assertEquals(0, result[10]);
	}
}
