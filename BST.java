/*************************************************
 * Binary Search Tree
 * @author Luke Johnson
 *
 */
public class BST
{
	private Node root;
	
	public BST()
	{
		this.root = null;
	}
	public BST(Node root)
	{
		this.root = root;
	}
	
	//Insert a node
	public void insert(Node root, Node insertNode)
	{
		if(insertNode != null)
		{
//			System.out.println(root == null);
//			System.out.println("insert node: " + insertNode.toString() + "| root: " + root.toString());
			int compare = ((Integer)insertNode.getData()).compareTo((Integer)root.getData());
			
			if(compare < 0)
			{
				if(root.hasLeft())
				{
					insert(root.getLeft(), insertNode);
				}
				else
				{
					root.setLeft(insertNode);
					insertNode.setParent(root);
				}
			}
			else if(compare > 0)
			{
				if(root.hasRight())
				{
					insert(root.getRight(), insertNode);
				}
				else 
				{
					root.setRight(insertNode);
					insertNode.setParent(root);
				}
			}
			else if (compare == 0)
			{
				root.setDuplicateCount(root.getDuplicateCount() + 1);
			}
		}
	}
	
	//Print tree in order
	public void printInOrder(Node root)
	{
		if (root != null)
		{
			printInOrder(root.getLeft());
			System.out.println(root.getData());
			printInOrder(root.getRight());
		}
	}

	public void setRoot(Node root)
	{
		this.root = root;
	}
	public Node getRoot()
	{
		return this.root;
	}
}
