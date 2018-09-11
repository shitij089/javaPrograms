package myJavaPrograms;

import java.util.Scanner;

public class Patt2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		
		int rows = scn.nextInt();
		
		for(int i = 0; i<rows;i++)
		{
			for(int j = (rows-i); j>=1; j--)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
