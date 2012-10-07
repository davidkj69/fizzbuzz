package org.ryry.programming.tasks.recursion;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ryry.programming.tasks.recursion.StringReverser;

public class StringReverserTests {

	@Test
	public final void nullStringTest() {
		assertNull(StringReverser.reverse(null));
	}
	
	@Test
	public final void singleCharTest() {
		String s = StringReverser.reverse("S");
		assertEquals("S", s);
	}
	
	@Test
	public final void singleWordTest() {
		String word = StringReverser.reverse("Something");
		assertEquals("gnihtemoS", word);
	}
	
	
	@Test public final void sentenceTest() {
		String sentence = StringReverser.reverse("The quick brown fox jumped over the lazy dog");
		assertEquals("god yzal eht revo depmuj xof nworb kciuq ehT", sentence);
	}
}
