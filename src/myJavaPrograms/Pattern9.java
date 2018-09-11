package myJavaPrograms;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows" );
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ "");
			}
			
			for(int j = i-1; j>=1;j--)
			{
				System.out.print(j+ "");
			}
			
			System.out.println();
		}

	}

}
