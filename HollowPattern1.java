/*
 
 Remember....
 --------------
 Row : i
 column: j
 
 First row: i=1
 Last row: i=n
 
 First col : j =1
 Last col : j = n
 
 Mid row/ col : n/2 + 1
 
 Pattern:
 * - - - *       i=1
 * - - - *		 i=2
 * - - - *		 i=3
 * - - - *		 i=4
 * - - - *		 i=5
 
 * for j==1 || j==n
 
 */
public class HollowPattern1 {

	public static void main(String[] args) {
		int n =5;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(j==1 || j==n) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
