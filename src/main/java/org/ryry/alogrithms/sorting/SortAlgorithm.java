package org.ryry.alogrithms.sorting;
/**
 * A generic sort demonstration algorithm
 */

class SortAlgorithm {
    /**
     * The sort item.
     */
    private SortItem parent;

    /**
     * When true stop sorting.
     */
    protected boolean stopRequested = false;

    /**
     * Set the parent.
     */
    public void setParent(SortItem p) {
	parent = p;
    }

    /**
     * Pause for a while.
     */
    protected void pause() throws Exception {
	if (stopRequested) {
	    throw new Exception("Sort Algorithm");
	}
	parent.pause(parent.h1, parent.h2);
    }

    /**
     * Pause for a while and mark item 1.
     */
    protected void pause(int H1) throws Exception {
	if (stopRequested) {
	    throw new Exception("Sort Algorithm");
	}
	parent.pause(H1, parent.h2);
    }

    /**
     * Pause for a while and mark item 1 & 2.
     */
    protected void pause(int H1, int H2) throws Exception {
	if (stopRequested) {
	    throw new Exception("Sort Algorithm");
	}
	parent.pause(H1, H2);
    }

    /**
     * Stop sorting.
     */
    public void stop() {
	stopRequested = true;
    }

    /**
     * Initialize
     */
    public void init() {
	stopRequested = false;
    }

    /**
     * This method will be called to
     * sort an array of integers.
     */
    void sort(int a[]) throws Exception {
    }
}
