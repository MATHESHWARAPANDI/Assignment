//Java Program to Print the Series Print Series 1 2 4 7 11 … N

package Assignment;

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		 // create a Scanner object
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        // loop to print the series
        for (int i = 0; i < n; i++)
        {
            System.out.print(1 + ((i * (i + 1)) / 2) + " ");
        }
	}

}
