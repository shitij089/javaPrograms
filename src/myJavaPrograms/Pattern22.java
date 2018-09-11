package myJavaPrograms;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		
		int rows = scn.nextInt();
		
		int count = rows-1;
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 1;j<=count;j++)
			{
				System.out.print(" ");
			}
			count--;
			
			for(int k = 1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
