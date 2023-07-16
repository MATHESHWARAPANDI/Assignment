//Java program to print hallow square number pattern

package pattern_program;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		 // taking variable for loop iteration and row .
	    int row,r,c;
	    //creating object 
	    Scanner s = new Scanner(System.in);
	    // entering the number of row
	    System.out.print("Enter rows : ");
	    row = s.nextInt();
	    //for loop for rows
	          for(r = 1; r <= row ; r++)
	        {
	            // printing stars by checking condition 
	            for(c = 1; c <= row; c++)
	                if(r == 1 || r == row || c == 1 || c == row)
	                    System.out.print(c); 
	                else
	                    System.out.print(" "); 
	            System.out.print("\n"); 
	        }                
	}

}
