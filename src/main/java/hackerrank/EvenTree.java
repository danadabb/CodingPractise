package hackerrank;

import java.util.*;

/**
 * Hackerrank problem
 * https://www.hackerrank.com/challenges/even-tree
 * <p>
 * Solution is to determine the number of children at each node
 * If the number of childen is even then we can remove the edge connecting to the child
 */
public class EvenTree
{

	public static void main(String[] args)
	{
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int V = in.nextInt();
		int E = in.nextInt();
		Graph g = new Graph();
		for (int i = 0; i < E; i++)
		{
			int v1 = in.nextInt();
			int v2 = in.nextInt();
			g.insertEdge(v1, v2);
		}
		System.out.println(g.getMaxEdgeRemoval());
	}
}

class Graph
{
	//verticies to children
	private Map<Integer, List<Integer>> vertices;
	private static int totalEdgesRemoved = 0;

	Graph()
	{
		vertices = new HashMap<>();
	}

	void insertEdge(int v1, int v2)
	{
		if (!vertices.containsKey(v2))
		{
			vertices.put(v2, new LinkedList<>());
		}

		if (!vertices.containsKey(v1))
		{
			vertices.put(v1, new LinkedList<>());
		}
		vertices.get(v2).add(v1);
	}

	/*
	 Super ugly way of doing it but I couldn't think of a better way to count the child nodes
	 but also keep track of the totalEdgesRemoved
	 */
	int getMaxEdgeRemoval()
	{
		dfs(1);
		return totalEdgesRemoved;
	}

	/**
	 * Use a dfs to compute the number
	 * of children at each node
	 * if the number of children is even
	 * we can remove that edge
	 *
	 * @param v starting node
	 * @return number of children
	 */
	private int dfs(Integer v)
	{
		int totalChildren = 0;
		for (Integer child : vertices.get(v))
		{
			//Count the number of children for the
			//current child node
			int children = dfs(child);
			if (children % 2 == 0)
			{
				totalEdgesRemoved++;
			}
			totalChildren += children;
		}

		return 1 + totalChildren;
	}

}