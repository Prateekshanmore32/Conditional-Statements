package conditionalStatements;

import java.util.Scanner;

public class IfStatement {

	public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int x=sc.nextInt();
			if(x<=69)
			{
				/*
				 * enter the block only if the condition is true
				 */
				
				System.out.println("Number is less than equal to 69");
			}
			if(x>=96)
			{
				/*
				 * enter the block only if the condition is true
				 */
				
				System.out.println("Number is greater than equal to 96");
			}

	}

}


/*
Enter a number
69
Number is less than equal to 69
*/