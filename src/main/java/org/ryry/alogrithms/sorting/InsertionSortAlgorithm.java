package org.ryry.alogrithms.sorting;
/**
 * An insertion sort demonstration algorithm
 *
 */
class InsertionSortAlgorithm extends SortAlgorithm {
    void sort(int a[]) throws Exception {
	for (int i = 1; i < a.length; i++) {
	    int j = i;
	    int B = a[i];
	    while ((j > 0) && (a[j-1] > B)) {
                if (stopRequested) {
		    return;
                }
	        a[j] = a[j-1];
	        j--;
	        pause(i,j);
	    }
	    a[j] = B;
            pause(i,j);
        }
    }
}

