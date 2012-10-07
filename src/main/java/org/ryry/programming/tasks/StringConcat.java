package org.ryry.programming.tasks;

import java.util.HashMap;

/**
 * Write a function f(a, b) which takes two character string arguments and returns a 
 * string containing only the characters found in both strings in the order of a. 
 * Write a version which is order N-squared and one which is order N.  
 *
 */
public class StringConcat {

	public static final String concat(String a, String b) {
		
		if ((a == null) || (b == null)) {
			return null;
		}
		
		StringBuffer sb = new StringBuffer();
		char[] aCharacters = a.toCharArray();
		char[] bCharacters = b.toCharArray();
		
		for (int adx = 0; adx < aCharacters.length; adx++) {
			for (int bdx = 0; bdx < bCharacters.length; bdx++) {
				if (aCharacters[adx] == bCharacters[bdx]) {
					sb.append(bCharacters[bdx]);
				}
			}
		}
		
		return sb.toString();
	}
	
	public static final String concatEfficient(String a, String b) {
		
		if ((a == null) || (b == null)) {
			return null;
		}
		
		StringBuffer sb = new StringBuffer();
		char[] aCharacters = a.toCharArray();
		char[] bCharacters = b.toCharArray();
		HashMap<Character, Integer> bMap = new HashMap<Character, Integer> ();
		
		// Load the characters of b in a map O(N)
		for (int bdx = 0; bdx < bCharacters.length; bdx++) {
			if (bMap.containsKey(bCharacters[bdx])) {
				Integer count = bMap.get(bCharacters[bdx]) + 1; 
				bMap.put(bCharacters[bdx], count);
			} else {
				bMap.put(bCharacters[bdx], new Integer(1));
			}
		}
		
		// Scan the map for duplicates O(N)
		for (int adx = 0; adx < aCharacters.length; adx++) {
			if (bMap.containsKey(aCharacters[adx])) {
				Integer count = bMap.get(aCharacters[adx]);
				for (int idx = 0; idx < count; idx++) {
					sb.append(aCharacters[adx]);
				}
			}
		}
		
		return sb.toString();
	}
	
}
