package ctci;

import java.util.HashMap;
/**
 * Created by Dana on 17/08/2016.
 * Check if a string has all unique characters
 * Question 1.1 CtCi
 */
public class isUnique
{
	public static void main(String[] args)
	{
		String str1 = "tt";
		System.out.println(isUniq(str1));
		System.out.println(isUniq2(str1));

		System.out.println(isUniq("abc"));
		System.out.println(isUniq2("abc"));
	}

	/**
	 * Using extra storage
	 * @param str
	 * @return true or false
	 */
	private static boolean isUniq(String str)
	{
		HashMap<Character,Boolean> table = new HashMap<>();

		for (int i = 0; i < str.length(); i++)
		{
			if (table.containsKey(str.charAt(i)))
			{
				return false;
			}
			table.put(str.charAt(i), true);
		}

		return true;
	}

	/**
	 * No extra storage just bit manipulation
	 * @param str
	 * @return true or false
	 */
	private static boolean isUniq2(String str)
	{
		if (str.length() > 26) //if the length is greater than 26 there must be duplicate characters
		{
			return false;
		}

		int checker = 0;

		for (int i = 0; i < str.length(); i++)
		{
			int val = str.charAt(i) - 'a'; //get the int value of the char
			if ((checker & (1 << val)) > 0) //check if int value is set in checker aleady
				return false;

			checker = checker | 1 << val; //set the value in checker
		}

		return true;
	}

}


