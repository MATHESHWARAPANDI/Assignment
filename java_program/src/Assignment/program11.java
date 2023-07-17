// printing only multiples of 3 and 5

package Assignment;

public class program11 {
	
	public static void main(String[] args) {
		int n = 500;
		for (int i = 0; i <= n; i++)
			if (i % 3 == 0 && i % 5 == 0)
				System.out.println(i);

	}
}