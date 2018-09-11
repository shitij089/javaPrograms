package myJavaPrograms;

import java.util.Scanner;

public class Patt6 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			int j;
			for(j=1;j<=(i-1);j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=rows;j++)
			{
				System.out.print(j + "");
			}
			
			System.out.println();
		}
		
		for(int i = rows-1;i>=1;i--)
		{
			int j;
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(j=i;j<=rows;j++)
			{
				System.out.print(j + "");
			}
			
			System.out.println();
		}
		
		

	}

}
