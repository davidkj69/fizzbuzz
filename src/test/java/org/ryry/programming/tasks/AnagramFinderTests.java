package org.ryry.programming.tasks;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramFinderTests {

	@Test
	public final void nullTest() {
		assertFalse(AnagramFinder.isAnagram(null, ""));
	}
	
	@Test
	public final void sizeMismatchTest() {
		assertFalse(AnagramFinder.isAnagram("abc", "abcdef"));
	}
	
	@Test
	public final void identicalStringTest() {
		assertTrue(AnagramFinder.isAnagram("abcdef", "abcdef"));
	}
	
	@Test
	public final void notAnAnagramTest() {
		assertFalse(AnagramFinder.isAnagram("abc", "def"));
	}
	
	@Test
	public final void isAnAnagramTest() {
		assertTrue(AnagramFinder.isAnagram("example", "elpmaxe"));
	}
}
