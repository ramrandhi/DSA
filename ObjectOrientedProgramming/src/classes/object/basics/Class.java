package classes.object.basics;

public class Class {
	public static void main(String[] args) {
		Class c = new Class();
		PStudent student1 = new PStudent(1011,"ram",101);
		System.out.println(student1);
	}
	
}

class PStudent {
	int rollNumber;
	String names;
	int marks;
	
	public PStudent(int rollNumber , String names , int marks ) {
		this.rollNumber = rollNumber;
		this.names = names;
		this.marks = marks;
	}

//	@Override
//	public String toString() {
//		return "PStudent [rollNumber=" + rollNumber + ", names=" + names + ", marks=" + marks + "]";
//	}
}
