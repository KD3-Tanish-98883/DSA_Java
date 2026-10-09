import java.util.Scanner;

public class Question9 {
	
	public static int gcd(int a, int b) {
		if(Math.max(a, b) % Math.min(a, b) == 0 )
			return Math.min(a, b);
		for (int i = (Math.min(a, b))/2; i>0; i--) {
			if(a%i==0 && b%i==0)
				return i;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		int a = 40, b=60;
		gcd(a, b);
		System.out.println();
	}
}
