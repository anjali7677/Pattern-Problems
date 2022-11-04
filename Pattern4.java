
/*
 
 Pattern:
 *****
 ****
 ***
 **
 *
 
 */

import java.util.Scanner;
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			
			//j from i to n
			
			/*
			  like...
			  1 2 3 4 5    i=1
			    2 3 4 5    i=2
			      3 4 5    i=3
			        4 5    i=4
			          5	   i=5
		   */
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		sc.close();

	}

}