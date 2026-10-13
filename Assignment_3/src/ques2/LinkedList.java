package ques2;

public class LinkedList{

	static class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data=value;
			next=null;
		}	
	}
	
	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public void createList() { 
		head = new Node(10); 
		head.next = new Node(20); 
		head.next.next = new Node(30); 
		head.next.next.next = new Node(40); 
		}
	
	public void insertSorted(int value) {
		Node newnode = new Node(value);
		Node trav=head;
		while(trav.next.data < value) {
			trav=trav.next;
		}
		newnode.next=trav.next;
		trav.next=newnode;
	}
	
	public void display() {
		Node trav = head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}		
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.createList();
		
		list.insertSorted(25);
		
		list.display();
	}
}



	
