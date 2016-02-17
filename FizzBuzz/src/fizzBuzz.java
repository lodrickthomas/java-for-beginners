
public class fizzBuzz {

	public static void main(String[] args) {
		// count from 1 to 100
		for(int i = 1; i <= 100; i++) {
			// A multiple of both
			// '&&' means AND (both conditions have to be met) '||' means OR (one condition has to be met.)
			if (((i % 5) == 0) && ((i % 7) == 0))
		        System.out.printf("\nfizzbuzz(%d)", i);    
			
				// multiple of 3
		      	else if ((i % 3) == 0) System.out.printf("\nfizz(%d)", i); 
				
				// multiple of 5
		      	else if ((i % 5) == 0) System.out.printf("\nbuzz(%d)", i); 
			
				// else just print it
		      	else System.out.print(i);    
				
				// just adds a space in between numbers.
		      	System.out.print(" ");
		    }
		    System.out.println();
	}
}

// made the console a weird output to make it fit in the pic.
// added the numbers to the end of fizz/buzz so you could see which is which better