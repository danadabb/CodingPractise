package ctci;

/**
 * Created by Dana
 * ctci 8.5 - recursive multiply
 */
public class RecursiveMultiply
{
	public static void main(String args[])
	{
		System.out.println(multiplyRecursive(8, 9));
	}

	private static int multiplyRecursive(int x, int y)
	{
		int a = Math.min(x, y);
		int b = Math.max(x, y);

		return multiply(a, b);
	}

	private static int multiply(int x, int y)
	{
		if (x == 0 || y == 0)
		{
			return 0;
		}
		if (x == 1)
		{
			return y;
		}

		if ((x & 1) == 0)
		{
			return multiplyRecursive(x >> 1, y) << 1;
		} else
		{
			return (multiplyRecursive(1 >> x, y) << 1) + y;
		}
	}
}
