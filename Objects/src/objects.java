
public class objects {

	public static void main(String[] args) {
		/* Create two objects using constructor */
	      Student stuOne = new Student();
	      Student stuTwo = new Student();

	      System.out.println("Student 1: ");
	      // Invoking methods for each object created
	      stuOne.stuName("jenny");
	      stuOne.stuAge(26);
	      stuOne.stuMajor("Computer Enginerring");
	      stuOne.stuTuition(14000);
	      stuOne.printStudent();

	      System.out.println("\n\nStudent 2: ");
	      stuTwo.stuName("chris");
	      stuTwo.stuAge(21);
	      stuTwo.stuMajor("Computer Science");
	      stuTwo.stuTuition(12000);
	      stuTwo.printStudent();

	}

}

// main 
