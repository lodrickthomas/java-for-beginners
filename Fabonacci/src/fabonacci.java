
public class fabonacci {

	public static void main(String[] args) {
		// long because if not you will get weird formated numbers, try changing to int or double to see.
		long[] array = new long[50];
		// we know 0 & 1 are the first two numbers, so we go from there.
		array[0] = 0;
		array[1] = 1;
		// loop through array
		for (int i = 0; i < array.length; i++){
			// we start the loop at 0 index so until its greater than 1 we will not run the code below.
			// if you do you will get an out of bounds error since 0-1 and 0-2 are negatives and array cant be neg.
			if (i>1){
			array[i] = array[i-1] + array[i-2];
			}
			// i + 1 because im using the index to number the numbers and don't wanna start at 0
			System.out.println(i+1 + ". "+ array[i]);
		}
	}

}

/* you could also print index 0 and 1 before the for loop and start i at 2, and you could then eliminate the nested if statement */