package myJavaPrograms;

import java.util.Scanner;

public class FibonacciProgram {

	public static void main(String[] args) {
		
		int n1 = 0, n2 = 1, temp;

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number you want!");
		
		int num = scn.nextInt();
		
		while(num>0)
		{
			temp = n1 + n2;
			n1 = n2;
			n2 = temp;
			
			System.out.println("" +temp);
		}
		

	}

}
