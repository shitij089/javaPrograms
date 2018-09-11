package myJavaPrograms;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("please enter the number of rows");
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=7;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}
		
		for(int i = rows-1;i>=1;i--)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
