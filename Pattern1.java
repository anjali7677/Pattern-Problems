import java.util.Scanner;

/*
 
 Pattern:
 *****
 
 */
public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		for (int i = 0; i<= n; i++)
		{
			System.out.print("*");
		}
		sc.close();
	}

}
