package ctci;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CTCI: PowerSet question 8.4
 * Created by Dana
 */
public class Powerset
{

	public static void main(String args[])
	{
		Set<String> subset = powerset(new HashSet<>(Arrays.asList("A", "B", "C", "D")));

		System.out.println(subset);
	}

	/**
	 * To get all the subsets of a set,
	 * we go through each element of the set
	 * and add it to the list. Then we go through
	 * each of the previous subsets and create additional
	 * subsets with the current element appended.
	 * so with ABCD
	 * first iteration we'll add A
	 * second we'll add B then AB (we combine B with the only existing element in the subset A)
	 * third will be C, AC, BC, ABC etc.
	 *
	 * @param S the original set
	 * @return the powerset which will be (2 ^ N ) - 1 elements
	 */
	private static Set<String> powerset(Set<String> S)
	{
		Set<String> subsets = new HashSet<>();

		for (String element : S)
		{
			Set<String> newSubsets = new HashSet<>();
			for(String subset : subsets)
			{
				newSubsets.add(subset + element);
			}

			subsets.add(element);
			subsets.addAll(newSubsets);

		}
		return subsets;
	}

}
