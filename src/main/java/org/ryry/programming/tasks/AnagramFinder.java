package org.ryry.programming.tasks;

import java.util.HashMap;
import java.util.Map;

public class AnagramFinder {

	public static final boolean isAnagram(String s, String t) {
		
		if ((s==null) || (s.length() < 1) || (t == null) || (t.length() < 1) || (s.length() != t.length())) {
			return false;
		}
		
		if (s.equals(t))
			return true;
		
		Map<Character,Integer> letters = new HashMap<Character, Integer> ();
		
		char[] c = s.toCharArray();
		
		for(int idx = 0; idx < c.length; idx++) {			
			if (letters.containsKey(c[idx])) {
				int count = letters.get(c[idx]);
				letters.put(c[idx], count+1);
			} else {
				letters.put(c[idx], 1);
			}
		}
		
		char[] tChars = t.toCharArray();
		
		for(int idx = 0; idx < tChars.length; idx++) {
			if (letters.containsKey(tChars[idx])) {
				int count = letters.get(tChars[idx]) -1;
				if (count > 0) {
					letters.put(tChars[idx], count);
				} else {
					letters.remove(tChars[idx]);
				}
			} else {
				return false;
			}
		}
		
		return true;
	}
}
