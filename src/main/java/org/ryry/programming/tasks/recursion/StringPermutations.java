package org.ryry.programming.tasks.recursion;


/**
 * find all permutations of the letters in a particular string
 * 
 *
 */
public class StringPermutations {

	public static void allPermuations(String s) {
		
		if (s == null)
			return;
		
		permuteString("", s);
	}
	
	private static void permuteString(String beginningString, String endingString) {
	    if (endingString.length() <= 1)
	      System.out.println(beginningString + endingString);
	    else
	      for (int i = 0; i < endingString.length(); i++) {
	        try {
	          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

	          permuteString(beginningString + endingString.charAt(i), newString);
	        } catch (StringIndexOutOfBoundsException exception) {
	          exception.printStackTrace();
	        }
	      }
	  }
}
