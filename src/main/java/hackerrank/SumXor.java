package hackerrank;

import java.util.Scanner;

/**
 * Hackerrank: https://www.hackerrank.com/challenges/sum-vs-xor
 * Used a mathematical approach to this problem.
 * Iterating over all the values will cause time out.
 * @author Dana Dabbagh
 */
public class SumXor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();

		// Count all the zeroes in the current number binary
		int numZeroes = 0;
		while( n > 0 )
		{
			long k = n & 1;
			if ( k == 0 )
			{
				numZeroes++;
			}
			n = n >> 1;
		}

		//Result is all possible combinations of the number of zeroes found (2 ^ numZeroes )
		System.out.println((long)Math.pow(2,numZeroes));
	}
}
