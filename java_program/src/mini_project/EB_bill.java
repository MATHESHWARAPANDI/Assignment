package mini_project;
import java.util.Scanner;
public class EB_bill {
     public static void main(String[] args) {
    	  Scanner ec_unit = new Scanner(System.in);
           System.out.println("enter number of units");
           float unit= ec_unit.nextFloat();
 float price = 0, temp1, temp2, temp3, temp4, temp5, temp6;

			 if (unit >= 0 && unit <= 100) {
				 //price per units is Rs.0.00
				System.out.println("Total Units: " + unit + " ,\nBill Amount: ₹" + price);
			   }

			 else if (unit >= 101 && unit <= 200) {
				//price per units is Rs.2.25
				temp1 = unit - 100;
				price += temp1 * 2.25f;
				System.out.println("Total Units: " + unit + " ,\nBill Amount: ₹" + price);
			   }

			  else if (unit >= 201 && unit <= 400) {
				// price per unit is Rs.4.50
				temp1 = unit - 200;
				temp2 = 200 - 100;
				price += (temp2 * 2.25f) + (temp1 * 4.50f);
				
				System.out.println("Total Units: " + unit + " ,\nBill Amount: ₹" + price);
			   }

			   else if (unit >= 401 && unit <= 500) {
				// price per unit is Rs.6.00
				temp1 = unit - 400;
				temp2 = 400 - 200;
				temp3 = 200 - 100;
				price += (temp1 * 6.00f) + (temp2 * 4.50f) + (temp3 * 2.25f);
				
				System.out.println("Total Units: " + unit + " ,\nBill Amount: ₹" + price);
			    } 
			
			   else if (unit >= 501 && unit <= 600) {
				// price per unit is Rs.8.00
				temp1 = unit - 500;
				temp2 = 500 - 400;
				temp3 = 400 - 100;
				price += (temp1 * 8.00f) + (temp2 * 6.00f) + (temp3 * 4.50f);
				
				System.out.println("Total Units: " + unit + " ,\nBill Amount: ₹" + price);
                } 
			
			    else if (unit >= 601 && unit <= 800) {
			    // price per unit is Rs.9.00
				temp1 = unit - 600;
				temp2 = 600 - 500;
				temp3 = 500 - 400;
				temp4 = 400 - 100;
				price += (temp1 * 9.00f) + (temp2 * 8.00f) + (temp3 * 6.00f) + (temp4 * 4.50f);
				
				System.out.println("Total Units: " + unit + " ,\nBill Amount: ₹" + price);
                } 
			
			    else if (unit >= 801 && unit <= 1000) {
				// price per unit is Rs.10.00
				temp1 = unit - 800;
				temp2 = 800 - 600;
				temp3 = 600 - 500;
				temp4 = 500 - 400;
				temp5 = 400 - 100;
				price += (temp1 * 10.00f) + (temp2 * 9.00f) + (temp3 * 8.00f) + (temp4 * 6.00f) + (temp5 * 4.50f);
				
				System.out.println("Total Units: "+unit+" ,\nBill Amount: ₹"+price);
				}
			
			    else if (unit > 1000) {
				// price per unit is Rs.11
				temp1 = unit - 1000;
				temp2 = 1000 - 800;
				temp3 = 800 - 600;
				temp4 = 600 - 500;
				temp5 = 500 - 400;
				temp6 = 400 - 100;
				price += (temp1 * 11.00f) + (temp2 * 10.00f) + (temp3 * 9.00f) + (temp4 * 8.00f) + (temp5 * 6.00f)
						+ (temp6 * 4.50f);
				
			    System.out.println("Total Units: "+unit+" ,\nBill Amount: ₹"+price);
			    } 
			
			    else {
                  System.out.println("enter correct unit");
                  }

}
}
