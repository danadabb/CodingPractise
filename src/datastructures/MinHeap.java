package datastructures;

/**
 * Created by Dana
 */

class MinHeapTest
{

	public static void main(String args[])
	{
		MinHeap heap = new MinHeap(10);

		heap.insert(1);

	}
}

public class MinHeap<T extends Comparable<T>>
{

	int[] heap;
	int size = 0;

	public MinHeap(int size)
	{
		heap = new int[size];
	}

	public void insert(int data)
	{


	}
	/*
	Step 1 − Create a new node at the end of heap.
Step 2 − Assign new value to the node.
Step 3 − Compare the value of this child node with its parent.
Step 4 − If value of parent is greater than child, then swap them.
Step 5 − Repeat step 3 & 4 until Heap property holds.
	 */
}
