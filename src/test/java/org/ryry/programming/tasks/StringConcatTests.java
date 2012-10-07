package org.ryry.programming.tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringConcatTests {

	
	@Test
	public final void firstStringNullTest() {
		String concat = StringConcat.concat(null, "ERHHQE");
		assertNull(concat);
	}
	
	@Test
	public final void secondStringNullTest() {
		String concat = StringConcat.concat("FGWERG", null);
		assertNull(concat);
	}
	
	@Test
	public final void simpleTest() {
		String a = "ABCDEF";
		String b = "ACE";
		
		String concat = StringConcat.concat(a, b);
		assertNotNull(concat);
		assertEquals("ACE", concat);
	}
	
	@Test
	public final void singleCharOverlap() {
		String concat = StringConcat.concat("abcdefghijklmn", "i");
		assertNotNull(concat);
		assertEquals("i", concat);
	}
	
	@Test
	public final void orderOfATest() {
		String concat = StringConcat.concat("abcdefghijklmn", "nmlkjihgfedcba");
		assertNotNull(concat);
		assertEquals("abcdefghijklmn", concat);
	}
	
	@Test
	public final void repeatingCharTest() {
		String concat = StringConcat.concat("abcdef", "aaacccbbbeeedddfff");
		assertNotNull(concat);
		assertEquals("aaabbbcccdddeeefff", concat);		
	}	

	
	@Test
	public final void firstStringNullEfficientTest() {
		String concat = StringConcat.concatEfficient(null, "ERHHQE");
		assertNull(concat);
	}
	
	@Test
	public final void secondStringNullEfficientTest() {
		String concat = StringConcat.concatEfficient("FGWERG", null);
		assertNull(concat);
	}
	
	@Test
	public final void simpleEfficientTest() {
		String a = "ABCDEF";
		String b = "ACE";
		
		String concat = StringConcat.concatEfficient(a, b);
		assertNotNull(concat);
		assertEquals("ACE", concat);
	}
	
	@Test
	public final void singleCharOverlapEfficient() {
		String concat = StringConcat.concatEfficient("abcdefghijklmn", "i");
		assertNotNull(concat);
		assertEquals("i", concat);
	}
	
	@Test
	public final void orderOfAEfficientTest() {
		String concat = StringConcat.concatEfficient("abcdefghijklmn", "nmlkjihgfedcba");
		assertNotNull(concat);
		assertEquals("abcdefghijklmn", concat);
	}
	
	@Test
	public final void repeatingCharEfficientTest() {
		String concat = StringConcat.concatEfficient("abcdef", "aaacccbbbeeedddfff");
		assertNotNull(concat);
		assertEquals("aaabbbcccdddeeefff", concat);		
	}
	
	
	
}
