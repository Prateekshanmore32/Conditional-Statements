package conditionalStatements;

import java.util.Scanner;

public class IfElseIfElseStatement {

	public static void main(String[] args) {

			Scanner sc=new Scanner (System.in);
			System.out.println("Enter a number");
			int n=sc.nextInt();
			if(n<=10)                 //condition 1
			{
				/*
				 * enter the block if condition 1 is true
				 */
				System.out.println("Number is less than equal to 10");
			}
			else if(n>10&&n<=20)      //condition 2 
			{
				/*
				 * enter the block if condition 1 is false and condition 2 is true
				 */
				System.out.println("Number is greater than 10 but less than equal to 20");
			}
			else
			{
				/*
				 * enter the block if both condition 1 and 2 is false
				 */
				System.out.println("Number is greater than 20");
			}
	}

}
/*
Enter a number
15
Number is greater than 10 but less than equal to 20
*/