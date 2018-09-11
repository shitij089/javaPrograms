package myJavaPrograms;

import java.util.Scanner;

public class Pyramid2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of rows in the pyramid!");
		
		int rows = scn.nextInt();
		
		for(int i = rows;i>=1;i--)
		{
			for(int j = 1;j<=i*2;j++)
			{
				System.out.print(" ");
			}
			
			for(int j = i;j<=rows;j++)
			{
				System.out.print(j + " ");
			}
			
			for(int j = (rows-1); j>=i;j--)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
