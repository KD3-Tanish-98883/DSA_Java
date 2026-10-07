import java.util.Scanner;
//Implement binary search algorithm if array is sorted in descending order
public class Question4 {
	
	public static int binaryDesc(int arr[], int key) {
		int left = 0, right = arr.length-1, mid;
		while(left<right) {
			mid = (left+right)/2;
			
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {99,88,77,66,55,44,33,22,11};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		int key = sc.nextInt();
		
		int index = binaryDesc(arr, key);
		if(index!=-1)
			System.out.println("key found at index : "+index);
		else
			System.out.println("Key not found");
	}
}
