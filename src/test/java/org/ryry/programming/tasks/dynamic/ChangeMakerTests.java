package org.ryry.programming.tasks.dynamic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.ryry.programming.tasks.dynamic.ChangeMaker;

public class ChangeMakerTests {

	int[] demons = {1, 5, 10, 25, 50};
	
	@Test
	public final void oneCent() {
		assertEquals(1, ChangeMaker.change(demons, 1));
	}
	
	@Test
	public final void nickel() {
		assertEquals(1, ChangeMaker.change(demons, 5));
	}
	
	@Test
	public final void twoCoins() {
		assertEquals(2, ChangeMaker.change(demons, 75));
	}
	
	@Test
	public final void fourCoins() {
		int best = ChangeMaker.change(demons, 90);
		assertEquals(4, best);
	}
	
	
	
	
	@Test
	public final void oneCentSimple() {
		assertEquals(1, ChangeMaker.simpleChange(demons, 1));
	}
	
	@Test
	public final void nickelSimple() {
		assertEquals(1, ChangeMaker.simpleChange(demons, 5));
	}
	
	@Test
	public final void twoCoinsSimple() {
		assertEquals(2, ChangeMaker.simpleChange(demons, 75));
	}
	
	@Test
	public final void fourCoinsSimple() {
		int best = ChangeMaker.simpleChange(demons, 90);
		assertEquals(4, best);
	}
	
}
