package day3;

public class Student2 {
	
	String name;         //instance variables
	int rn;
	int pn;
	String address;
	
	Student2(String _name, int roll_no, int phn_no, String _address){
		name = _name;
		rn = roll_no;
		pn = phn_no;
		address = _address;
		
		
	}

	void display(){
		System.out.println(name+" "+rn+" "+pn+" "+address);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student2 s1 = new Student2("Sam", 1, 123456789, "'123 street name'");
		Student2 s2 = new Student2("John", 2, 987654321, "'456 street name'");
		s1.display();
		s2.display();
		}

}
