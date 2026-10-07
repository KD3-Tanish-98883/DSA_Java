import java.util.*;
//Implement linear search algorithm to find the nth occurence of the given element. If nth occurrence is not found, return -1
public class Question3 {
	
	public static int linearSearch(int arr[], int key, int n) {
		int c=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == key)
				c++;
			if(c==n) 
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ele and the nth occurence");
		int key = sc.nextInt();
		int occ = sc.nextInt();
		
		int index = linearSearch(arr, key, occ);
		if(index!=-1){
			System.out.println("Nth occurenece of element is on : "+index);
		}
		else
			System.out.println("No nth occurence");
	}
}
