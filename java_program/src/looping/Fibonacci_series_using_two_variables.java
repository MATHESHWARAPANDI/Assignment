package looping;

import java.util.Scanner;

public class Fibonacci_series_using_two_variables {

	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int last = 1, lastToLast = 0;
		
		if (n >= 0)
			System.out.print(lastToLast + " ");
		if (n >= 1)
			System.out.print(last + " ");
		for (int i = 2; i <= n; i++) {
			int cur = last + lastToLast;
			System.out.print(cur + " ");
			lastToLast = last;
			last = cur;
		}
	}

}
