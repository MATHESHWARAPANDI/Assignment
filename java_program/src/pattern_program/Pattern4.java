//java program to print inverse right triangle star pattern

package pattern_program;

public class Pattern4 {

	public static void main(String[] args) {
		int size = 5;
	    for (int i = 0; i < size; i++) {
	      // print stars
	      for (int j = 0; j < size - i; j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	}

}
