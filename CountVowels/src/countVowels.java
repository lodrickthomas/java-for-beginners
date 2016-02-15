import java.util.*;
public class countVowels {

	public static void main(String[] args) {
		System.out.print("Type something: ");
        Scanner input = new Scanner(System.in);                  
        String countThis = input.nextLine(); // what user enters
        String[] wordArray = countThis.split(" "); // .split separates the string by whatever is in the quotes(a space).
        
        // initializations 
        int wordCount = 0;
        int vowelCount = 0;
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;
        
        for (int i = 0; i < countThis.length(); i++) { // loops through what was entered by user.
        	char ch = countThis.charAt(i); // .charAt returns the character located at the String's specified index.
        	switch (ch){ // to use charAt, must be initialized as a char.
        	
        	case 'a':
        		aCount++;
        		break;
        		
        	case 'e':
        		eCount++;
        		break;
        		
        	case 'i':
        		iCount++;
        		break;
        	case 'o':
        		oCount++;
        		break;
        	case 'u':
        		uCount++;
        		break;
        	}
        	
        	vowelCount = aCount + eCount + iCount + oCount + uCount; // add vowels up
        }
        System.out.printf("vowels : %d", vowelCount);
        System.out.printf("\nwords: %d", wordArray.length);
        System.out.printf("\nA: %d\nE: %d\nI: %d\nO: %d\nU: %d",aCount, eCount, iCount, oCount, uCount);

	}
}
