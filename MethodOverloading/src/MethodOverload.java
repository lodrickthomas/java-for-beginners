import java.util.*;

public class MethodOverload {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 2 integers to compare: ");
		int a = input.nextInt();
		int b = input.nextInt(); 
		
		// int parameters 
		System.out.printf("The maximum of %d and %d is " + greatestValue(a, b), a,b);
		
		// two double parameters
		System.out.print("\nEnter 2 doubles to compare: ");
		double d1 = input.nextDouble();
		double d2 = input.nextDouble();
		System.out.printf("The maximum of %.2f and %.2f is " + greatestValue(d1, d2), d1, d2);
		
		// three double parameters
		System.out.print("\nEnter a 3rd double: ");
		double d3 = input.nextDouble();
		System.out.printf("The maximum of %.2f, %.2f, and %.2f is " + greatestValue(d1, d2, d3), d1, d2, d3);
	}
	
	// max of two int values
	public static int greatestValue(int num1, int num2) {
		if (num1 > num2) return num1;
		else
		return num2;
	}
	
	// max of two double values
	public static double greatestValue(double num1, double num2) {
		if (num1 > num2) return num1;
		else
		return num2;
	}
	
	// max of 3 double values
	public static double greatestValue(double num1, double num2, double num3) {
		return greatestValue(greatestValue(num1, num2), num3);
	}

}

// overloading methods allows you to do the same thing with different data types.
/* this example makes an original method that determines the greater number and... 
 * overloads it with double parameters.*/
