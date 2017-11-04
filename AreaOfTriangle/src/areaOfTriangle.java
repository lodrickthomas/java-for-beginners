import java.text.DecimalFormat;
import java.util.*;

public class areaOfTriangle {

	public static void main(String[] args) {

	    //create an object of class AreaOfTriangle...
        AreaOfTriangle areaoftriageobj = new AreaOfTriangle();

        //store an object in result variable
        double result = areaoftriageobj.triangle();

        System.out.println("The area of triangle is: " + result + " millimeter square");

        //get results in 2 decimal places using DecimalFormat class...
        DecimalFormat n = new DecimalFormat("#.##");

        System.out.println("The area of triangle in 2 decimalplaces is: " + n.format(result) + " millimeter square");

        //get results in 4 decimal places using DecimalFormat class...
        DecimalFormat n1 = new DecimalFormat("#.####");

        System.out.println("The area of triangle in 4 decimalplaces is: " + n1.format(result) + " millimeter square");



	}

}
class AreaOfTriangle{
    double base, height;
    Scanner input = new Scanner(System.in);
    public double triangle(){
        //request the value of length from user...
        System.out.print("Enter the value base of triangle in millimeter: ");
        base = input.nextDouble();

        //request the value of height from user...
        System.out.print("Enter the value height of triangle in millimeter: ");
        height = input.nextDouble();

        // calculates the area of triangle using formula (b*h)/2
        double area = (base * height) *0.5;

        return area;


//        System.out.printf("The area of the triangle is %.2f", area);
        // %f cause were using doubles and %.2f to limit to 2 decimal places.


    }


}
