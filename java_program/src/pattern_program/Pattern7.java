//Java Program to Print Right Angled Triangle with Increasing Number Pattern

package pattern_program;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		
		// taking size of no. of iteration 
        //Row and column are the iterators
        int size , numberOfRows , numberOfColumns;
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.print("Enter the number of rows : ");
       size = scanner.nextInt();
        //Outer loop to iterate the rows
        //Iterates from 1 to the size entered by the user
         for (  numberOfRows = 1; numberOfRows <= size; numberOfRows++)
        {
            //Inner loop to iterate the columns
        //Iterates from 1 to row value 
            for (  numberOfColumns = 1; numberOfColumns <= numberOfRows; numberOfColumns++)
            {
                //Prints the num value
                System.out.print(numberOfColumns + " ");
            }
            // printing in new line  
            System.out.println();
        }
}
}