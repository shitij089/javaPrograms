package myJavaPrograms;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want to enter");
		
		int rows = scn.nextInt();  
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				System.out.print(j+ " ");
			}
			System.out.println();
		}

	}

}
