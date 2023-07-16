//Java Program to Print Right Triangle Star Pattern.

package pattern_program;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// taking variable for loop iteration and row .
	    int row,r,c;
	    //creating object 
	    Scanner s = new Scanner(System.in);
	    // entering the number of row
	    System.out.print("Enter rows : ");
	    row = s.nextInt();
	    // iteration for no. of row 
	    for(r=1;r<=row;r++)
	     {
	         //iteration for printing stars
	         for(c=1;c<=r;c++)
	         {
	             System.out.print("* ");
	         }
	         //taking to the new line 
	         System.out.println(" ");
	     } 
	}

}
