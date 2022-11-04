
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
 
 Hollow square..
 
 * * * * *       i=1
 * - - - *		 i=2
 * - - - *		 i=3
 * - - - *		 i=4
 * * * * *		 i=5
 
 * Top row/col = 1
 * Last row/col = n
 
 (1,1) (1,2) (1,3) (1,4) (1,5)
 
 (2,1) (2,2) (2,3) (2,4) (2,5)
 
 (3,1) (3,2) (3,3) (3,4) (3,5)
 
 (4,1) (4,2) (4,3) (4,4) (4,5)
 
 (5,1) (5,2) (5,3) (5,4) (5,5)
 
 */
public class HollowPattern4 {

	public static void main(String[] args) {
		int n =5;
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==1 ||j==1 || i==n || j ==n) {
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