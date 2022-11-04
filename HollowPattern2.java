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
 Plus Pattern
 
 
 - - * - -       i=1
 - - * - -		 i=2
 * * * * *		 i=3
 - - * - -		 i=4
 - - * - -		 i=5
 
 * mid row, i = n/2 + 1
 * mid col, j = n/2 + 1
 
 */
public class HollowPattern2 {

	public static void main(String[] args) {
		int n =5;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==n/2+1 || j==n/2+1) {
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

