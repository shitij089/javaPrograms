package myJavaPrograms;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			int j;
			for(j=1;j<=(rows-i); j++)
			{
				System.out.print(" ");
				
			}
			
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
