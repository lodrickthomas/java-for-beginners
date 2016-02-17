
public class Student {
	
		// what data objects are gonna hold.
		String name;
		int age;
		String major;
		double tuition;
		
		// constructor of student class
		public Student(){
	   }
		
		// student name
		public void stuName(String stuName){
			name =  stuName;
       }
		
		// student age
		public void stuAge(int stuAge){
			age =  stuAge;
	   }
		
	   // student major
		public void stuMajor(String stuMajor){
			major = stuMajor;
	   }
		
	   // student tuition
		public void stuTuition(double stuTuition){
			tuition = stuTuition;
	   }
		
	   /* Print the Employee details */
		public void printStudent(){
			System.out.printf("Name: %s", name);
			System.out.printf("\nAge: %d", age);
			System.out.printf("\nMajor: %s", major);
			System.out.printf("\nTuition: %f", tuition);
	   }
}

// student class 
