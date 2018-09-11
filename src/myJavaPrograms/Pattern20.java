package myJavaPrograms;

import java.util.Scanner;

public class Pattern20 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the num of rows!");
		
		int rows = scn.nextInt();
		
		for(int i = 0;i<rows;i++)
		{
			int j;
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			if(i!= rows-1)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print(" *");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

	
		
	}


