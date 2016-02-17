
public class fabonacci {

	public static void main(String[] args) {
		// make a double array
		double[] array = new double[52];
		// we know 0 & 1 are the first two numbers, so we go from there.
		array[0] = 0;
		array[1] = 1;
		// next = 2 cause thats the next index number
		int next = 2;
		// one/twoBefore because you take the 2 index slot values before and add them up to get the next one.
		int oneBefore = next - 1;
		int twoBefore = next - 2;
		// loop through array
		for (int i = 0; i < array.length - 2; i++){
			// array[2] = array[2-1(1)] + array[2-2(0)]
			array[next] = array[oneBefore] + array[twoBefore];
			// i + 1 because im using the index to number the numbers and don't wanna start at 0
			System.out.println(i+1 + ". "+ array[i]);
			// increment all after print, so next loop it will go to next index slot and calculate one/twoBefore again.
			oneBefore++;
			twoBefore++;
			next++;
		}
	}

}
