package myJavaPrograms;

public class String1 {

	public static void main(String[] args) {
		
			String s1 = "Sachin";
			String s2 = "Sachin";
			
			String s3 = new String("Sachin");
			
			String s4 = "Gaurav";
			
			String s5 = "Khanna";
			
			String s6 = "KHANNA";
			
			String s7 = "John";
			
			System.out.println(s1.compareTo(s7));
			System.out.println(s1.equals(s3));
			System.out.println(s2.equals(s3));
			System.out.println(s1.equals(s4));
			System.out.println(s3.equals(s3));
			
			System.out.println(s5.equals(s6));
			System.out.println(s5.equalsIgnoreCase(s6));
			
			System.out.println("Compare to:" + s1 == s3);
			
	}
}