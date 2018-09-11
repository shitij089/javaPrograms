package myJavaPrograms;

import java.util.Scanner;

public class GeekPattern5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows");
		
		int rows = scn.nextInt();
		
		int num = 1;
		
		for(int i = 0;i < rows;i ++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print(num + " ");
				num ++;
			}
			
			System.out.println();
		}

	}

}
