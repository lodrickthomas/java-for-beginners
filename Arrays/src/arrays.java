import java.util.*;

public class Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// method #1
		int[] array = new int[3];
		array[0] = 45; // first slot in an array is always at index 0 and it goes from there.
		array[1] = 37; // so the second slot in the array would be in the slot number 1.
		array[2] = 91;
		int count = 0; // counter to keep track of index array
		// The comment block below is the classic for loop way, I will be using enhanced for loops though.
		/*for (int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		} */
		System.out.println("method #1:");
		for (int i: array){ // this line is the same as "for (int i = 0; i < array.length; i++)"
			System.out.printf("the number in index number %d is %d\n",count,i); 
			// remember you dont need to specify the index number in enhanced for loops.
			count++;
		}
		// method #2
		System.out.println("method #2:");
		int[] myArray = {36,29,97};
		int myCount = 0; // counter to keep track of index array
		for(int i: myArray){
			System.out.printf("the number in index number %d is %d\n", myCount,i);
			myCount++;
		}
		
		// method #3, User input using strings
		System.out.println("method #3, using strings:");
		System.out.print("how many names will you enter? "); // this is used cause the array size must be specified
		int length = input.nextInt();
		int counter = 0; // counter to keep track of index array
		String[] names = new String[length];
		for (String i: names){ // this for loop lets you input the strings to the arrays
			names[counter] = input.next(); // notice that a space separates string inputs
			counter++;
			
			if (counter == names.length){ // if statement that prints out the array statements when the array if full.
				input.close(); // closes user input if the array is full/ reaches the end.
				int counter1 = 0; // couter to keep track of array index
				for (String i1: names){ // already and i variable so named it i1
					System.out.printf("the string in index %d is '%s'\n", counter1,i1);
					counter1++;
				}
			}
		}
	}
}
