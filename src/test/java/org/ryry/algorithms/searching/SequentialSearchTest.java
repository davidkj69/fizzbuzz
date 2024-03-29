package org.ryry.algorithms.searching;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ryry.alogrithms.searching.SequentialSearch;

public class SequentialSearchTest {

	@Test
	  public void testContains() {
	    int[]a = {1, 2, 3, 4, 5, 19, 17, 7};
	    assertTrue(SequentialSearch.contains(a, 17));
	    assertTrue(SequentialSearch.contains(a, 1));
	    assertTrue(SequentialSearch.contains(a, 2));
	    assertTrue(SequentialSearch.contains(a, 3));
	    assertTrue(SequentialSearch.contains(a, 4));
	    assertFalse(SequentialSearch.contains(a, 10));
	  }
	
}
