package myJavaPrograms;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows!");
		
		int rows = scn.nextInt();
		
		for(int i = 0;i<rows;i++)
		{
			for(int j = 0;j<rows;j++)
			{
				if( i == j)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}

}
