package ques3;
//Implement add position and delete position in circular linked list.
public class CircularLinkedList {
	
	static class Node{
		private Node next;
		private int data;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	
	public CircularLinkedList() {
		head = null;
	}
	
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
	
	public void addPosition(int value , int pos) {
		Node newnode = new Node(value);
		Node trav = head;
		for(int i=1; i < pos-1; i++) {
			trav=trav.next;
		}
		newnode.next= trav.next;
		trav.next=newnode;
	}
	
	public void deletePosition(int pos) {
		Node trav = head;
		for(int i=1; i<pos-1;i++) {
			trav=trav.next;
		}
		trav.next=trav.next.next;
	}
	
	public void display() {
		Node trav = head;
		while(trav!=null) {
			System.out.print(" "+trav.data);
			trav=trav.next;
		}		
	}
	
	public static void main(String[] args) {
		
		CircularLinkedList list = new CircularLinkedList();
		
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.addPosition(50, 3);
		
		list.deletePosition(2);
		list.display();
	}
}
