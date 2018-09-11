package myJavaPrograms;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows!" );
		
		int rows = scn.nextInt();
		
		for(int i = rows;i>=1;i--)
		{
			int j;
			for(j=1;j<=2 * i;j++)
			{
				System.out.print(" ");
			}
			
			for(j=i;j<=rows;j++)
			{
				System.out.print(j + " ");
			}  
			
			 for ( j = rows-1; j >= i; j--)
	            {                 
	                System.out.print(j+" ");             
	            }
	             
	            System.out.println();
			
		}

	}

}
