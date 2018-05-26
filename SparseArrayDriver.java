/********************************************
 * Class to Implement a Sparse Array using Binary Search Trees
 * 
 * @author Luke Johnson
 *
 */
public class SparseArrayDriver
{

	static final int SIZE = 500;

	public static void main(String[] args)
	{
		BST[] sparseArray = new BST[6];

		int data;
		for (int i = 0; i < 6; i++)
		{
			sparseArray[i] = new BST();
		}

		//Fill each tree in the array
		for (int i = 0; i < SIZE; i++)
		{
			data = (int) (Math.random() * 600);
			Node newNode = new Node(data);
			// System.out.println(data == 600 ? "true": "");
			if (data < 100)
			{
				if (sparseArray[0].getRoot() != null)
				{
					sparseArray[0].insert(sparseArray[0].getRoot(), newNode);
				}
				else
				{
					sparseArray[0].setRoot(newNode);
				}
			}
			else if (data >= 100 && data < 200)
			{
				if (sparseArray[1].getRoot() != null)
				{
					sparseArray[1].insert(sparseArray[1].getRoot(), newNode);
				}
				else
				{
					sparseArray[1].setRoot(newNode);
				}
			}
			else if (data >= 200 && data < 300)
			{
				if (sparseArray[2].getRoot() != null)
				{
					sparseArray[2].insert(sparseArray[2].getRoot(), newNode);
				}
				else
				{
					sparseArray[2].setRoot(newNode);
				}
			}
			else if (data >= 300 && data < 400)
			{
				if (sparseArray[3].getRoot() != null)
				{
					sparseArray[3].insert(sparseArray[3].getRoot(), newNode);
				}
				else
				{
					sparseArray[3].setRoot(newNode);
				}
			}
			else if (data >= 400 && data < 500)
			{
				if (sparseArray[4].getRoot() != null)
				{
					sparseArray[4].insert(sparseArray[4].getRoot(), newNode);
				}
				else
				{
					sparseArray[4].setRoot(newNode);
				}
			}
			else
			{
				if (sparseArray[5].getRoot() != null)
				{
					sparseArray[5].insert(sparseArray[5].getRoot(), newNode);
				}
				else
				{
					sparseArray[5].setRoot(newNode);
				}
			}
		}
		
		//Print each tree in the sparse array, in order
		for (int i = 0; i < 6; i++)
		{
			System.out.println("Tree #: " + i);
			sparseArray[i].printInOrder(sparseArray[i].getRoot());
		}
	}

}
