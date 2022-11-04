/*
 
 Pattern:
           *
         * * * 
       * * * * *  
     * * * * * * *  
   * * * * * * * * *
     * * * * * * *
       * * * * *
         * * *
           *
           
    ---Hill Pattern---       
   1. Dec. space
   2. Increasing *
   3. Increasing *
   
    ---Reverse Hill Pattern---    
 	
 	1. Increasing space
 	2. Decreasing star
 	3. Decreasing star
 */
public class Pattern9 {

	public static void main(String[] args) {
		int n=5;
		
		//Increasing hill from 1 to 4
		for(int i=1; i<n; i++)
		{
			for(int j=i;j<=n;j++) {
				System.out.print("  ");
			}
			for(int j=1; j<i; j++) {
				System.out.print("* ");
			}
			
			//j from 1 to i
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		// Decreasing hill from 1 to 5
		for(int i=1; i<=n; i++) {
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
