import java.util.Scanner;
//find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } Ouput: 3
public class Question8 {
	public static void nonRepeating(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			boolean isRepeated = false;
			for (int j = 0; j < arr.length; j++) {
				if(i != j && arr[i]==arr[j] ) {
					isRepeated=true;
				}
			}
			if(!isRepeated) {
				System.out.println("Non repeated ele : "+arr[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		
		nonRepeating(arr);
	}
}
