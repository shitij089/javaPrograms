package myJavaPrograms;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		
		int rows = scn.nextInt();
		
		for(int i = rows;i>=1;i--)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ "");
			}
			System.out.println();
		}
	}

}
