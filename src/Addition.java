// Fig. 2.7: Addition.java
// Addition program that displays the sum of two numbers.
// class Scanner part of java.util package must be imported.
// String and System classes are implicitly imported as part of package java.lang.
import java.util.Scanner; // program uses class Scanner

public class Addition 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);
		
		int number1; // first number to add
		int number2; // second number to add
		int sum; // sum of number1 and number2
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user
				
		System.out.print("Enter second integer: "); // prompt
		number2 = input.nextInt(); // read first number from user
		
		sum = number1 + number2;
		
		System.out.printf("Sum is %d%n", sum); // Display sum
	}

}
