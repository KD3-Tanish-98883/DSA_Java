package Question_3;
//find successor of given node and return it in BST.
public class BinartSeachTree {
	
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
	
	public BinartSeachTree() {
		root=null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node newnode = new Node(value);
	
		if(root == null)
			root=newnode;
		else {
			Node trav = root;
			while(true) {
				if(value<trav.data) {
					if(trav.left==null) {
						trav.left=newnode;
						break;
					}
					else
						trav=trav.left;
				}
				else {
					if(trav.right==null) {
						trav.right=newnode;
						break;
					}
					else
						trav=trav.right;
				}
			}
		}
	}
	
	public Node searchNode(int key) {5
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
	
	public int findsuccessor(int value) {
		Node trav = searchNode(value);
		
		if(trav.right!=null)
			trav=trav.right;
		while(trav.left!=null) {
			trav=trav.left;
		}
		return trav.data;
	}

	public static void main(String[] args) {
		
		BinartSeachTree bst = new BinartSeachTree();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(2);
		bst.addNode(15);
		bst.addNode(6);
		bst.addNode(14);
		bst.addNode(4);
		bst.addNode(7);
		
		System.out.println(bst.findsuccessor(6));
	}
	
	
}
