package myJavaPrograms;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of lines you want to enter");

		int rows = scn.nextInt();
		
		for(int i = rows;i>=1;i--)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for(int i = 2;i<=rows;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
