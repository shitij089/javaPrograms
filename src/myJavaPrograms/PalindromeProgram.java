package myJavaPrograms;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {

		int temp, rev = 0, rem;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number you want!");
		
		int num = scn.nextInt();                                                                                    
		
		 temp = num;
		
		while(num>0)
		{
			rem = num % 10;
			rev = (rev*10)+rem;
			num = num/10;
		}
		
		if( temp == rev)
		{
			System.out.println("Palindrome Number...");
		}
		else
		{
			System.out.println("Not Palindrome Number...");
		}
	}

}
