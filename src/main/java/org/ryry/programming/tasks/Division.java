package org.ryry.programming.tasks;

/**
 * Implement division (without using the divide or mod operator). 
 * The answer should return in the form quotient r remainder.
 *
 */
public class Division {

	public static class Quotient {
		private int quotient;
		private int remainder;
		public int getQuotient() {
			return quotient;
		}
		public void setQuotient(int quotient) {
			this.quotient = quotient;
		}
		public int getRemainder() {
			return remainder;
		}
		public void setRemainder(int remainder) {
			this.remainder = remainder;
		}
		
	}
	
	/**
	 * In the expression a ÷ b = c, a is called the dividend or numerator, b the divisor.
	 * 
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	public static Quotient divide(int dividend, int divisor) {
		
		if (divisor == 0)
			return null;
		
		if (dividend < 0) {
			dividend *= -1;
		}
		
		if (divisor < 0) {
			divisor *= -1;
		}
		
		Quotient q = new Quotient();
		int quotient = 0;
		
		while (dividend >= divisor) {
			dividend -= divisor;
			quotient++;
		}
		
		q.setQuotient(quotient);
		q.setRemainder(dividend);
		
		return q;
	}
}
