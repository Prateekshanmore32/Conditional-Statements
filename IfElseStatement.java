package conditionalStatements;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {

		 Scanner sc=new Scanner (System.in);
		 System.out.println("Enter Your age");
		 int age=sc.nextInt();
		 if(age>=18)
		 {
			 /*
			  * enter the block only if the condition is true
			  */
			 System.out.println("Yes! You can vote!!!");
		 }
		 else
		 {
			 /*
			  * enter the block only if the condition is false
			  */
			 System.out.println("Sorry! You are under age...");
		 }
	}

}
