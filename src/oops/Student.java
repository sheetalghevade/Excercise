package oops;

public class Student {
	public Student() {
		System.out.println("Student Name: Unknown");
	}
	public Student(String input) {
		System.out.println("Student Name: "+input);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student_name = new Student();
		Student student_name1 = new Student("Sheetal");
		
	}
	
}

