/*************************************************
 * Class of nodes with integer data
 * @author Luke Johnson
 *
 */
public class Node
{
	private int data;
	private Node left;
	private Node right;
	private Node parent;
	int duplicateCount;
	
	public Node()
	{
		this.data = 0;
		this.left = null;
		this.right = null;
		this.parent = null;
		this.duplicateCount = 0;
	}
	public Node(int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent = null;
		this.duplicateCount = 0;
	}
	
	//check for left child
	public boolean hasLeft()
	{
		return this.left != null;
	}
	
	//check for right child
	public boolean hasRight()
	{
		return this.right != null;
	}
	
	//GETTERS AND SETTERS
	public int getData()
	{
		return data;
	}
	public Node getLeft()
	{
		return left;
	}
	public Node getRight()
	{
		return right;
	}
	public Node getParent()
	{
		return parent;
	}
	public void setData(int data)
	{
		this.data = data;
	}
	public void setLeft(Node left)
	{
		this.left = left;
	}
	public void setRight(Node right)
	{
		this.right = right;
	}
	public void setParent(Node parent)
	{
		this.parent = parent;
	}
	public int getDuplicateCount()
	{
		return duplicateCount;
	}
	public void setDuplicateCount(int duplicateCount)
	{
		this.duplicateCount = duplicateCount;
	}
	
}
