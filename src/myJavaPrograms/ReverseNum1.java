package myJavaPrograms;

public class ReverseNum1 {

	public static void main(String[] args) {

		int num = 123456789;
		
		int reversenum = 0;
		
		while(num>0)
		{
			reversenum = reversenum * 10;
			reversenum = reversenum + num%10;
			num = num/10;
		}
		
		System.out.println("The reverse of the number is:" + reversenum);

	}

}
