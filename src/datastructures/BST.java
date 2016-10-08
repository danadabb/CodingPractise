package datastructures;

public class BST
{

	public static void main(String[] args)
	{
		BST bst = new BST();

		bst.insert(27);
		bst.insert(14);
		bst.insert(18);
		bst.insert(23);
		bst.insert(601);
		bst.insert(34);

		bst.display(bst.rootNode());
	}

	private Node root;

	private Node rootNode()
	{
		return this.root;
	}

	void insert(int data)
	{
		if (root == null)
		{
			root = new Node(data);
		} else
		{
			Node current = root;
			while (true)
			{
				if (data <= current.data)
				{
					//insert left
					if (current.left == null)
					{
						current.left = new Node(data);
						return;
					}
					current = current.left;
				} else
				{
					if (current.right == null)
					{
						current.right = new Node(data);
						return;
					}
					current = current.right;
				}
			}
		}
	}

	private void display(Node node)
	{
		if (node != null)
		{
			display(node.left);
			System.out.println(node.data);
			display(node.right);
		}
	}

	private class Node
	{
		Node left;
		Node right;
		int data;

		Node(int data)
		{
			this.data = data;
			left = null;
			right = null;
		}

	}
}


