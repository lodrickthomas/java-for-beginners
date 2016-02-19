import java.util.*;

public class Methods {
	
	// define method named sum with 2 parameters, a & b which are integers.
	public static int sum(int a, int b){
		// result is sum of parameters
		int result = a + b;
		// result kind of saves your variable you're returning so you can access it universally outside of this method.
		// and also exits the method
		return result;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two numbers to find the sum: ");
		int one = input.nextInt();
		int two = input.nextInt();
		// call method 'sum', set the two parameters to vars one and two.
		System.out.println("The sum is " + sum(one, two));
	}
}

/* Methods usually are not in the same file as your main because most programs 
 * have quite a few methods so they are stored in a library of methods.*/