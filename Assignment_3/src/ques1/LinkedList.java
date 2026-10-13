package ques1;
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
	
	public void addBefore(int value, int data) {
		Node trav=head;
		Node newnode = new Node(value);
		while(trav.next!=null) {
			if(trav.next.data==data) {
				newnode.next=trav.next;
				trav.next=newnode;
				return;
			}
			trav=trav.next;
		}
	}
	
	public void addAfter(int value, int data) {
		Node trav = head;
		Node newnode = new Node(value);
		while(trav.next!=null) {
			if(trav.data==data) {
				newnode.next=trav.next;
				trav.next=newnode;
				return;
			}
			trav=trav.next;
		}
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
		
		list.addBefore(100,30);
		list.addAfter(50,30);
		
		list.display();
	}
}

