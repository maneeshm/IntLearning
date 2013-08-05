package Wed_5_29_2013;

public class Practice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Node root = new Node();
		Node left = new Node();
		Node right = new Node();
		
    System.out.println("Common Ancestor Value : " + findCommonNode(root, left, right).value);
		
	}

	
	static Node findCommonNode(Node root, Node left, Node right){

		if (root == null || left == null || right == null)
			return null;
		else
			if(left == root || right == root)
				return root;
			else
				if (left.value < root.value && right.value > root.value)
					return root;
				else 
					if (left.value < root.value && right.value < root.value)
						findCommonNode(root.left, left, right);
					else
						if (right.value > root.value && left.value > root.value)
							findCommonNode(root.right, left, right);

		return null;
	}
	
}

class Node{
	public int value;
	public Node left;
	public Node right;
}