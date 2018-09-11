package myJavaPrograms;

import java.util.Scanner;

public class Patern13 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows!");
		
		int rows = scn.nextInt();
		
		for(int i = 1;i<=rows;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
		System.out.println();	
		}

	}

}
