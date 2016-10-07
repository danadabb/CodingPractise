package ctci;

import java.util.Scanner;

/**
 * CTCI question - add two numbers without using addition operator
 * @author Dana Dabbagh
 */
public class AddNumbers
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println(addNumbers(a, b));
	}


	private static int addNumbers(int a, int b)
	{

		int previous = 0;
		int total = 0;
		int position = 0;
		while (a != 0 || b != 0)
		{
			//Get the first bit
			int bitA = a & 1;
			int bitB = b & 1;

			//If a and b are 1 then we'll have '0010' or 2
			if (bitA == 1 && bitB == 1)
			{
				total = 2;
			} else
			{
				//otherwise just 1 or 0
				total = bitA | bitB;
			}

			//shift left and xor to the previous total
			previous |= (total << position);

			//increment the current position
			position++;

			//move the next bit to first position
			a = a >> 1;
			b = b >> 1;
		}

		return previous;
	}
}
