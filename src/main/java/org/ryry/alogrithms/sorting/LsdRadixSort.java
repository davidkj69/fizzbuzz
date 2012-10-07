package org.ryry.alogrithms.sorting;

import java.util.ArrayDeque;
import java.util.Queue;

public class LsdRadixSort {

	private static final int numberOfBuckets = 10;
	   
    @SuppressWarnings("unchecked")
    private static final Queue<Integer>[] buckets = new ArrayDeque[numberOfBuckets];
    static {
        // 10 for base 10 numbers
        for (int i=0; i<numberOfBuckets; i++) {
            buckets[i] = new ArrayDeque<Integer>();
        }    
    }
   
    private static int[] unsorted = null;

    private LsdRadixSort() { }

    /**
     * Least significant digit sort.
     * @param unsorted
     * @return
     */
    public static int[] sort(int[] unsorted) {
        LsdRadixSort.unsorted = unsorted;

        int numberOfDigits = getMaxNumberOfDigits(); //Max number of digits
        int divisor = 1;
        int digit = 0;
        for (int n=0; n<numberOfDigits; n++) {
            for (int d : LsdRadixSort.unsorted) {
                digit = getDigit(d,divisor);
                buckets[digit].add(d);
            }
            int index = 0;
            for (Queue<Integer> bucket : buckets) {
                while (!bucket.isEmpty()) {
                    int integer = bucket.remove();
                    LsdRadixSort.unsorted[index++] = integer;
                }
            }
            divisor *= 10;
        }

        try {
            return LsdRadixSort.unsorted;
        } finally {
            //Make sure they are actually clear. Although, they should be.
            for (int i=0; i<numberOfBuckets; i++) {
                buckets[i].clear();
            }  
            LsdRadixSort.unsorted = null;
        }
    }

    private static int getMaxNumberOfDigits() {
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i : LsdRadixSort.unsorted) {
            temp = (int)Math.log10(i)+1;
            if (temp>max) max=temp;
        }
        return max;
    }
   
    private static int getDigit(int integer, int divisor) {
        return (integer / divisor) % 10;
    }
    

}
