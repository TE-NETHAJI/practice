package minimummax.hackerrank;
/*Given five positive integers,
 *  find the minimum and maximum values that can be calculated by summing
 *   exactly four of the five integers. 
 *   Then print the respective 
 *   minimum and maximum values as a single line of two space-separated long integers.

     Example

     arr = [1,3,5,7,9]

     The minimum sum is 1+3+5+7=16 and the maximum sum is 3+5+7+9=24. The function prints

     16 24
*/

import java.util.*;

public class MinMax {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			long sum = 0;
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			System.out.println("print values of five integers:");
			for (int i = 0; i < 5; i++) {
				long n = in.nextLong();
				sum += n;
				max = Math.max(max, n);
				min = Math.min(min, n);
			}
			System.out.println((sum - max) + " " + (sum - min));
		}
	}
}
