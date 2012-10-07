package org.ryry.programming.tasks.recursion;

public class TowersOfHanoi {

	/**
	 * 
	 * @param n - The number of disks
	 * @param startPole
	 * @param endPole
	 */
	public static void move(int n, int startPole, int endPole) {
	    if (n== 0){
	      return; 
	    }
	    int intermediatePole = 6 - startPole - endPole;
	    move(n-1, startPole, intermediatePole);
	    System.out.println("Move " +n + " from " + startPole + " to " +endPole);
	    move(n-1, intermediatePole, endPole);
	  }
	  
	  public static void main(String[] args) {
	    move(5, 1, 3);
	  }
}
