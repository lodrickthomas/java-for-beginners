import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string to reverse: ");
		String reverseThis = input.nextLine();
		String[] countThis = reverseThis.split(" ");			
		int wordCount = countThis.length;
			
		// sets reverseCode to equal to reverseThis, reverses it, and converts to a string.
		// StringBuffer class is used when there is a necessity to make a lot of modifications to Strings of characters.
		StringBuffer reverseCode = new StringBuffer(reverseThis).reverse();
		// if reverseCode wasnt a buffer, you need to add a to.String() after reverse()
		System.out.println("The string in reverse is... \n" + reverseCode);
		System.out.println("word count: " + wordCount); // just because

	}

}
 // this program reverses the whole input, try modifying it to make just the words in same order but reversed.