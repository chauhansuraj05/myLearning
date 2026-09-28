package objectClass;

public class Student {
	String name;
	int roll;

	public Student() {

	}

	public Student(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}

	public String toString() {
		return "Student Name : " + name + "\nStudent Roll : " + roll + "\n";
	}

	public static void main(String[] args) {
		Student s1 = new Student("Praveen", 23);
		// System.out.println("Student Name : "+s1.name);
		// System.out.println("Student Roll : "+s1.roll);
		//
		// System.out.println("========================");
		//
		Student s2 = new Student("Shubham", 15);
		// System.out.println("Student Name : "+s2.name);
		// System.out.println("Student Roll : "+s2.roll);

		System.out.println("========================");
		System.out.println(s1);
		System.out.println(s2);

		System.out.println("========================");

		System.out.println(s1);
		System.out.println(s2);
	}
}
