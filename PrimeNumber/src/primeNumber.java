import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the max? ");
		int range = input.nextInt();
		System.out.printf("The prime numbers up to %d are: \n", range);
		
		// gets all prime numbers up to max.
		for (int i = 2; i < range; i++){	// loops through max
			for(int j =2; j<=i; j++){		// start of algorithm that determines prime, see bottom **.
				if (j==i){					// prints out prime number when j reaches where the loop is at.
					System.out.println(i);
				}
				if (i%j == 0){	// determines if the number is prime or not
					break;
				}
			}
		}

	}

}

/* this basically is what the algorithm does
 * 1. first set it to loops through the whole max the user enetered.
 * 2. sets j = i, if j = i then increase j every time the loops runs.
 * 3. when j = i, print i because its done checking if it is prime
 * NOTE: "%" is almost the remainder module, 5 % 4 = 1. this is why we use it to determine prime.
 */