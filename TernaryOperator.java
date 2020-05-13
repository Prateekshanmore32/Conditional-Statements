package conditionalStatements;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		/*
		 *  var = condition ? exp_true : exp_false
		 */
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		String IsEven=x%2==0? "Number is even" :"Number is odd";
		System.out.println(IsEven);
	}

}
/*
Enter a number
26
Number is even

Enter a number
57
Number is odd

*/