package Assignment;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take user input for number of terms
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        // loop to print the series
        for (int i = 1; i <= n; i++) 
        {
            //finding square and printing series
            System.out.print(i * i + " ");
        }

	}

}
