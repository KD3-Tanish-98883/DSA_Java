import java.util.*;
//Write program to implement linear queue in which front and rear starts at 0.

class LinearQueue{
	private int arr[];
	private int size;
	private int rear,front;
	
	public LinearQueue(int size) {
		this.size=size;
		arr= new int[size];
		rear=front=0;
	}
	
	public void offer(int value) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			arr[rear] = value;
			rear++;
		}
	}
	
	public int poll() {
		int temp=0;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp=arr[front];
			front++;
		}
		return temp;
	}
	
	public int peek() {
		int temp=0;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp=arr[front];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return front == rear ;
		//return ((front == rear && rear == 0)||(front>rear));
	}
	
	public boolean isFull() {
		return rear == size;
	}
}

public class Question1 {
	
	public static void main(String[] args) {
		
		LinearQueue q = new LinearQueue(4);
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("1. Offer\n2. Poll\n3. Peek");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter the value");
				int value= sc.nextInt();
				q.offer(value);
				break;
			case 2:
				System.out.println("Poped element : "+q.poll());
				break;
			case 3:
				System.out.println("Peeked value : "+q.peek());
				break;
			}
		}while(choice != 0);
	}
}
