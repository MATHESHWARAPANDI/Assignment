//Java Program to Print Left Triangle Star Pattern

package pattern_program;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// taking variable for loop iteration and row .
	    int row,r,c;
	    //creating object 
	    Scanner s = new Scanner(System.in);
	    // entering the number of row
	    System.out.print("Enter rows : ");
	    row = s.nextInt();
	    //iteration for no. of row 
	        for (r=0; r<row; r++) 
	        {
	            //iteration for printing space 
	             for (c=2*(row-r); c>=0; c--)         
	               System.out.print(" ");  
	            //iteration for printing stars
	            for (c=0; c<=r; c++ ) 
	                System.out.print("* "); 
	            // printing new line .
	            System.out.println();   
	        }   
	}

}
