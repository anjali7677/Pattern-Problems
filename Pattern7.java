/*
 
 Pattern:
           *
         * * * 
       * * * * *  
     * * * * * * *  
   * * * * * * * * *
   
   1. Dec. space
   2. Increasing *
   3. Increasing *
   
 */
public class Pattern7 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1; i<=n; i++)
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

	}

}
