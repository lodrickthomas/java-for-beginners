
public class fabonacci {

	public static void main(String[] args) {
		double[] array = new double[50];
		// we know 0 & 1 are the first two numbers, so we go from there.
		array[0] = 0;
		array[1] = 1;
		// loop through array
		for (int i = 0; i < array.length; i++){
			if (i>1){
			array[i] = array[i-1] + array[i-2];
			}
			// i + 1 because im using the index to number the numbers and don't wanna start at 0
			System.out.println(i+1 + ". "+ array[i]);
		}
	}

}
