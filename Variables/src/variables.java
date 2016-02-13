
public class variables {

	public static void main(String[] args) {
		String string = "Hello World"; 
		// declares and initializes a String variable named string
		int integer = 54321; 
		// declares and initializes an Integer variable named integer
		double numDouble = 567.98; 
		// declares and initializes a Double variable named numDouble
		int red = 0, white = 56;
		// if multiple variables have the same value, you could declare and initialize them in one line like above.
		// this is just used to show an example and will not be used in the code below.
		// the type is only needed once, however the value need to be stated each time individually.
		
		System.out.println("printed seperately:");
		System.out.println(string);
		System.out.println(integer);
		System.out.println(numDouble);
		
		// printf is an alternate to print, it is less tedious when printing multiple variables.
		// you must specify the type with %s for strings, %d for integers, or %f for floats. 
		// printf format System.out.printf("%d", intVar); that would print whatever integer intVar holds.
		System.out.printf("\nprinted with one line using printf:\n%s\n%d\n%f\nprinted with chosen amount of decimals: %.2f", string, integer, numDouble, numDouble); 
		// by default when using printf, doubles are set to 6 decimals, I set the second numDouble to two decimals with "%.2f"
		
		System.out.println("\n\nprinted with one line using print/println:\n" + string + "\n" + integer + "\n" + numDouble);
		// can you see how printf can be less tedious?
		// ** you can see i have '\n' in a few places, what that does is skip a line. I use that to make the output look cleaner in the console.
	}
}
