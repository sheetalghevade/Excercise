package advjavaday1;

public class Student {
	String name;
	int roll_no;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.name = "Sheetal";
		s1.roll_no = 1;
		System.out.println("Name: " +s1.name);
		System.out.println("Roll number: "  +s1.roll_no);
		System.out.printf("Name: %s and roll number: %d", s1.name, s1.roll_no);
	}

}
