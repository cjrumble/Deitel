// Comparison.java
// Compare integers using if statements, relational operators
// and equality operators.

import java.util.Scanner; // program uses class Scanner

public class Comparison 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create a Scanner to obtain input from the command window
		// removed WARNING Resource leak: input is never closed by adding try-with-resources statement
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to compare
		int number2; // second number to compare
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user
				
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // read second number from user
		
		if (number1 == number2)
			System.out.printf("%d == %d%n", number1, number2); 
		
		if (number1 != number2)
			System.out.printf("%d != %d%n", number1, number2); 
		
		if (number1 < number2)
			System.out.printf("%d < %d%n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d%n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d%n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d%n", number1, number2); 

		try {
			// Use input
			input.reset();
			} finally {
			    input.close();     
			}
		// Scanner is AutoClosable so should not need finally block and close()
	
	}
}
