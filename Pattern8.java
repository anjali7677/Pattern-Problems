/*
 
 Pattern:
 * * * * * * * * *
   * * * * * * *
     * * * * *
       * * *
         *
         
     ---Reverse Hill Pattern---    
 	
 	1. Increasing space
 	2. Decreasing star
 	3. Decreasing star
 	
 */
public class Pattern8 {

	public static void main(String[] args) {
		int n =5;
		
		for(int i=1; i<=5; i++) {
			//j from 1 to i
			for(int j=1; j<=i; j++) {
				System.out.print("  ");
			}
			
			// j from i to n-1
			for(int j=i;j<n; j++) {
				System.out.print("* ");
			}
			
			//j from i to n
			for(int j=i;j<=n; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}

	}

}
