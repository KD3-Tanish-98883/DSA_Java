import java.util.*;
//Write a program to implement descending stack. (Initialize top = SIZE)

class DescStack{
	int arr[];
	int size;
	int top;
	
	public DescStack(int size) {
		this.size=size;
		arr = new int[size];
		top=size;
	}
	
	public void push(int value) {
		if(isFull())
			System.out.println("Stack is full");
		else {
			arr[top]=value;
			top--;
		}
	}
	
	public int pop() {
		int temp=-1;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			temp=arr[top];
			top++;
		}
		return temp;
	}
	
	public int peek() {
		int temp=-1;
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}
		else {
			temp=arr[top];
		}
		return temp;
	}
	
	public boolean isEmpty() {
		return top==size;
	}
	
	public boolean isFull() {
		return top==size;
	}
}

public class Question2 {
	
public static void main(String[] args) {
		
		DescStack st = new DescStack(4);
		
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
				st.push(value);
				break;
			case 2:
				System.out.println("Poped element : "+st.pop());
				break;
			case 3:
				System.out.println("Peeked value : "+st.peek());
				break;
			}
		}while(choice != 0);
	}
}
