import java.util.*;
//Implement circular queue using counter method (maintain count of elements in a queue and use it for checking empty and full conditions)

class CircularQueue{
	private int arr[];
	private int size;
	private int front,rear,c;
	
	public CircularQueue(int size) {
		this.size=size;
		arr = new int[size];
		front=rear=-1;
		c=0;
	}
	
	public void offer(int value) {
		if(isFull())
			System.out.println("Queue is full");
		else {
			rear = (rear+1)%size;
			arr[rear]=value;
			c++;
		}
	}
	
	public int poll() {
		int temp=-1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = arr[(front+1)%size];
			front = (front+1)%size;
			c--;
			if(front == rear)
				front = rear =-1;
		}
		return temp;
	}
	
	public int peek() {
		int temp=-1;
		if(isEmpty())
			System.out.println("Queue is empty");
		else {
			temp = arr[(front+1)%size];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return c==0;
	}
	
	public boolean isFull() {
		return c==size;
	}
}

public class Question3 {
	
	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(4);
		
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
