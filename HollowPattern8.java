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
 
 Hollow diamond pattern..
 
 - - - - * - - - -       i=1
 - - - * - * - - -		 i=2
 - - * - - - * - -		 i=3
 - * - - - - - * -		 i=4
 * - - - - - - - *       i=5
 - * - - - - - * -
 - - * - - - * - -
 - - - * - * - - -
 - - - - * - - - -		 
 
 * Pattern: diamond
 * Starting side, j=1, j=i
 * Ending side, j=i, j=n
 
 (1,1) (1,2) (1,3) (1,4) (1,5)
 
 (2,1) (2,2) (2,3) (2,4) (2,5)
 
 (3,1) (3,2) (3,3) (3,4) (3,5)
 
 (4,1) (4,2) (4,3) (4,4) (4,5)
 
 (5,1) (5,2) (5,3) (5,4) (5,5)
 
 */
public class HollowPattern8 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<n; i++) {
			
			//1. decreasing spaces triangle
			for(int j=i; j<n; j++) {
				System.out.print("  ");	
			}
			
			//2. Increasing * triangle
			for(int j=1; j<i; j++) {
				if(j==1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			//3. Increasing * triangle
			for(int j=1; j<=i; j++) {
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

        for(int i=1; i<=n; i++) {
			
			//1. increasing spaces triangle
			for(int j=1; j<i; j++) {
				System.out.print("  ");	
			}
			
			//2. deccreasing * triangle
			for(int j=i; j<n; j++) {
				if(j==i)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			//3. decreasing * triangle
			for(int j=i; j<=n; j++) {
				if(j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
