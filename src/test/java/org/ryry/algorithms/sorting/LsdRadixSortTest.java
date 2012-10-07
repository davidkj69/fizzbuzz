package org.ryry.algorithms.sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.ryry.alogrithms.sorting.LsdRadixSort;

public class LsdRadixSortTest {

	int[] unsorted = {98, 12, 1154, 6, 72, 35, 876};
	
	
	@Test
	public final void leastSignificantDigitTest() {		
		int[] sorted = LsdRadixSort.sort(unsorted);
		assertEquals(6, sorted[0]);
		assertEquals(12, sorted[1]);
		assertEquals(35, sorted[2]);
		assertEquals(72, sorted[3]);
		assertEquals(98, sorted[4]);
		assertEquals(876, sorted[5]);
		assertEquals(1154, sorted[6]);
	}
	
}
