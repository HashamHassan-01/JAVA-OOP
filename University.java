class Student{
	private int rollNumber;
	private String name;
	private String dep;
	
	private static int studentCount = 0;
	
	public Student(){
		this.rollNumber= 0;
		this.name = "Unknown";
		this.dep = "Unassigned";
		studentCount++;
	}
	
	public Student(int rollNumber, String name, String dep){
		this.rollNumber = rollNumber;
		this.name = name;
		this.dep = dep;
		
		studentCount++;
	}
	public void displayInfo(){
		System.out.println("The Roll Number of the Student is: " + this.rollNumber);
	    System.out.println("The Name of the Student is: " + this.name);
		System.out.println("The Departement of the Student is: " + this.dep);
		System.out.println(" *_______________________* ");
	}
	public static void displayTotalStudents(){ 
	        System.out.println("The Total Number of Students are: " + studentCount);
	}
}
	public class University{
		public static void main(String args[]){
			Student s1 = new Student();
			Student s2 = new Student( 48 , "Hasham", "Computer Science");
			Student s3 = new Student( 121 , "Ahmad", "Computer Science");
		  s1.displayInfo();
		  s2.displayInfo();
		  s3.displayInfo();
		  
		  Student.displayTotalStudents();
		}
	}
	
	
		