//Java program to print increased number pattern

package pattern_program;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		// Create a new Scanner object
        Scanner scanner = new Scanner(System.in);

        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        int k = 1;
        
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
	}

}
