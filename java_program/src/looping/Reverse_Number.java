package looping;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int m, n, reversed = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        m = s.nextInt();
        for (; m != 0; m /= 10) {
            n = m % 10;
            reversed = reversed * 10 + n;
        }
        System.out.println("Reversed Number: " + reversed);
	}

}
