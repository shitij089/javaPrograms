package myJavaPrograms;

class Student {

	int rollNum;
	String name;
	String city;

	void insert_Student_Information(int r, String n, String c) {
		rollNum = r;
		name = n;
		city = c;
	}

	void displayInformation() {
		System.out.println(rollNum + " "+ name + " "+ city + " ");
	}
}
public final class Tutorial2 {

	public static void main(String args[])
	{
		Student s1 = new Student(); 
		Student s2 = new Student();

		s1.insert_Student_Information(100,"Shitij","Kanpur");
		s2.insert_Student_Information(101,"Tarang","Delhi");

		s1.displayInformation();
		s2.displayInformation();

	}
}