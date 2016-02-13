import java.util.*; // you must import java.util for scanner to work. you can use the one I do or java.util.Scanner to just import scanner

public class userInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        // create scanner object named input
        
        System.out.print("enter a string: ");
        // using print instead of println lets me see what i enter on the same line.
        String hello = input.nextLine(); // ScannerName.nextLine(), nextInt() ect.
        // there is also an .next() without the Line(), but this only reads until a space is entered, so it can't read two inputs.
        // remove the Line() and enter two separate strings to see an example.
        System.out.printf("you entered the string '%s'", hello);
        // System.out.println("\nyou entered the string '" + hello + "'");  ** remove the comment slashes to see an alternate print.
        // remember, when using the %s, %d ect. format, you must use printf.
        // print & println will not work in the format used above
        // also in eclipse "syso then control + space" will auto complete the print statement
        
        System.out.print("\n\nenter an integer: ");
        int integer = input.nextInt();
        System.out.printf("you entered the integer '%d'", integer);
        // the ''s are optional

	}

}
