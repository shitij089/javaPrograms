package myJavaPrograms;

import java.util.Scanner;

public class Pattern23 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows!");
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			for(int k=1;k<=(rows-i);k++)
			{
				System.out.print(" ");
			}
		
			
			for(int j = 1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
