
public class Loops {

	public static void main(String[] args) {
		int x = 1;
		int exWhile = 1;
		int exEnhan[] = {5, 10, 15, 20, 25}; // this array is used to example an enhanced for loop
		// arrays will be covered fully in a later post
		int red = 13;
		
		System.out.println("while loop example:");
	    while ( x <= 5 ) { // loop while x is <= 5
	         System.out.println("x is " + x ); // print x
	         x++; // increment x by 1
	    }
	    
	    System.out.println("\ndo while example:");
	    do{ // do this, while exWhile <= 5
	         System.out.println("y is " + exWhile );
	         exWhile++;
	      }while ( exWhile <= 5 );
	    
	    System.out.println("\nfor loop example:");
	    // print exFor while exFor is <= 15, every time loop runs, increment by 1
	    for(int exFor = 10; exFor <= 15; exFor++) { // exFor is only recognized inside the for loop
	         System.out.println("exFor is " + exFor );
	      }
	    
	    System.out.println("\nfor loop to print array elements");
	    // runs the length of exEnhan array, i initialized at 0, incremented by 1 every loop.
	    for (int i = 0; i < exEnhan.length; i++) { // i is local, only recognized inside loop.
	    	System.out.println(exEnhan[i]); // print the i element in the exEnhan array
	    }
	    
	    System.out.println("\nenhanced for loop: does the same thing as the above for loop, less code.");
	    for (int i: exEnhan){ // i initialized at 0, incremented by 1 every loop. runs exEnhan length
	    	System.out.println(i);// if you put exEnhan[i], you would get an error with an enhanced loop.
	    }	// because its already implied.
	    
	    // the below if statement is pretty self explanatory
	    System.out.println("\nif statement example:");
	    if (red < 10){
	    	System.out.println(red + " is less than 10");
	    	
	    }else if (red > 10 ){
	    		System.out.println(red + " is greater than 10");
	    	}
	    else {
	    	System.out.println(red + " is equal to 10");
	 	}
	    
	    System.out.println("\nswitch statement example:");
	    String grade = "b";
	    switch (grade) {
	    case "a":
	          System.out.println("you got an A");// break exit the statement if the requirement is met
	          break; // if no break, the next case would be executed. remove the executed cases break to see.
	    case "b": 
	    	System.out.println("you got a B");
	          break;
	    case "c":
	    	System.out.println("you got a C");
	    	break;
	    default:
	    	System.out.println("you failed");
	        break;
	    }
	}
}

