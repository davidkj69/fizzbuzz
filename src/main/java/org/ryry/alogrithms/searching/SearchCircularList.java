package org.ryry.alogrithms.searching;

public class SearchCircularList {

	// {3, 4, 6, -3, -2, 1}

	public int maxElement(int[] a, int low, int high) {
		if (a == null)
			throw new RuntimeException("");
		if  (a.length == 1) {
			return a[0];
		}

		int first = a[0];
		int end = a[a.length-1];
		int mid = a[a.length/2];
		if (end > first) {
			return end;
		}
		if (first > mid) {   
			return maxElement(a, 0, a.length/2);
		} else {
			return maxElement(a, a.length/2+1, a.length);
		}

	}


}
