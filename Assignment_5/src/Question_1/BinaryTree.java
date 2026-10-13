package Question_1;
//Write a function to return level/depth of given node in a BST.
public class BinaryTree {
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data=value;
			left=right=null;
		}
	}
	
	private Node root;
	
	public BinaryTree() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void addNode(int value) {
		Node newnode = new Node(value);
		
		if(root==null)
			root=newnode;
		else {
			Node trav = root;
			while(true) {
				if(value<trav.data) {
					if(trav.left==null) {
						trav.left=newnode;
						break;
					}
					else {
						trav=trav.left;
					}
				}
				else {
					if(trav.right==null) {
						trav.right=newnode;
						break;
					}
					else{
						trav=trav.right;
					}
				}
			}
		}
	}
	
	public Node searchNode(int key) {
		Node trav=root;
		while(trav!=null) {
			if(key==trav.data)
				return trav;
			else if(key<trav.data)
				trav=trav.left;
			else
				trav=trav.right;
		}
		return null;
	}
	
	public int height(Node trav) {
		if(trav==null)
			return -1;
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = (hl>hr? hl:hr)+1;
		return max;
	}
	
	public int height() {
		return height(root);
	}
	
	public void heightOfNode(int value) {
		Node search= searchNode(value);
		System.out.println("Height : "+height(search));
	}
	
	private void preOrder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" "+trav.data);
		preOrder(trav.left);
		preOrder(trav.right);
	}
	
	public void preOrder() {
		System.out.print("Preorder : ");
		preOrder(root);
		System.out.println();
	}
	
	public void inOrder(Node trav) {
		if(trav==null)
			return;
		inOrder(trav.left);
		System.out.print(" "+trav.data);
		inOrder(trav.right);
	}
	
	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println();
	}
	
	public void postOrder(Node trav) {
		if(trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(" " + trav.data);
	}
	
	public void postOrder() {
		System.out.print("Postorder : ");
		postOrder(root);
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		BinaryTree bst = new BinaryTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		
		bst.preOrder();
		bst.inOrder();
		bst.postOrder();
		
		bst.heightOfNode(8);
		
		System.out.println("Height : " + bst.height());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
