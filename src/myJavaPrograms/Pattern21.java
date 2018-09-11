package myJavaPrograms;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the num of rows!");
		
		int rows = scn.nextInt();
		
		for(int i = 0;i<rows;i++)
		{
			int j;
			if(i == 0 || i == 6)
			{
				for(j=0;j<rows;j++)
				{
					System.out.print("*");
				}
			}
			
			if(i>=1 && i<=5)
			{
				for(j=0;j<rows;j++)
				{
					if(j == 0 || j == 6)
					{
						System.out.print("*");
					}
					else if(j>=1 && j<=5)
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
