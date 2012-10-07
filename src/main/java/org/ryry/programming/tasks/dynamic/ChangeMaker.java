package org.ryry.programming.tasks.dynamic;

import java.util.Hashtable;


/**
 * Given a set of coin denominators, find the minimum number of coins to give a certain amount of change. 
 *
 */
public class ChangeMaker {

	
	/**
	 * Dynamic only.
	 * 
	 *  for w from 0 to W do
  			T[0, w] := 0
		end for

		for i from 1 to n do
  			for j from 0 to W do
    			if j >= w[i] then
      				T[i, j] := max(T[i-1, j], T[i-1, j-w[i]] + v[i])
    			else
      				T[i, j] := T[i-1, j]
    			end if
  			end for
		end for
	 */
	public static int simpleChange(int[] w, int val) {
		
		int[][] tab = new int[val][w.length];
		
		for (int wdx = 0; wdx < w.length; wdx++) {
			tab[0][wdx] = 0;
		}
		
		for (int i = 1; i < val; i++) {
			for (int j = 0; j < w.length; j++) {
				if ( j >= w[i]) {
					tab[i][j] = max(tab[i-1][j], tab[i-1][j-w[i] + w[i]]);
				} else {
					tab[i][j] = tab[i-1][j];
				}
			}
		}
		
		return tab[val-1][0];
	}
	
	private static int max(int a, int b) {
		return (a > b) ? a:b;
	}

	/**
	 * Dynamic, recursive, with memoization.
	 * 
	 */
	public static Hashtable<Integer, Integer> solved = new Hashtable<Integer, Integer>();
	 
	public static int change(int[] k, int val) {
		 
	  // we've reached the end of recursion - a leaf
	  // if the value is less than zero it means that the current combination is not solvable
	  // if the value is zero, it means it is solvable
	  if (val <= 0) return val;

	  // for as many coins try to decrease the value for the coin value 
	  // and try to solve the smaller problem
	  int min = -1; //default: if it's not solvable
	  for (int i = k.length - 1; i >= 0; i--) {
	   
		  // if the coin k[i] exists in the solution, it means the solution is
		  // solutions(value - coin_value) + 1
		  // eg. we have coins: 1, 3, 5 and the value is 11
		  // if the coin 5 exists in the solution, try to solve the problem for value 11-5 = 6
		  // the solution is smaller_solution + 1
		  int newVal = val - k[i];
		  int r;

		  // dynamic programming - memoization
		  // if we already have the minimum for the new value, fetch it (with time complexity O(1)), 
		  // so that we don't recursively re-solve the problem and waste time
		  if (solved.get(newVal) != null) {
			  //solution = smaller_sollution + 1
			  r = solved.get(newVal) + 1;
		  } else {
			  //try to solve the smaller problem
			  r = change(k, newVal);
			  //if the solution is valid, the new solution is smaller_solution + 1
			  if (r >= 0) r++;
			  //else, keep the negative value - it means that it's not valid
			  //eg: coins 3, 5, value 11 is not solvable, the solution is -1
		  }
		  // from all of the solutions, get the minimum value
		  // and skip invalid solutions ( less than zero )
		  if ((r > 0) && (min == -1 || r < min)) {
			  min = r;
		  }
	  }
	  // dynamic programming - memoization
	  // once we do get the smallest possible solution, save it for later use
	  // it saves A LOT of time and useless work, that's already been done
	  solved.put(val, min);
	  return min;
	 }
}
