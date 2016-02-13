import java.util.*;

public class areaOfTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length: ");
		double base = input.nextDouble();
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		double area = (base * height) / 2;
		// calculates area using formula (b*h)/2
		
		System.out.printf("The area of the triangle is %.2f", area); 
		// %f cause were using doubles and %.2f to limit to 2 decimal places.

	}

}
