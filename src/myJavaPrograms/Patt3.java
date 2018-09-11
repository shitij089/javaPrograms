package myJavaPrograms;

import java.util.Scanner;

public class Patt3 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j = rows;j>(rows-i);j--)
			{
				System.out.print(j + " ");
			}
			
			System.out.println();
		}

	}

}
