package myJavaPrograms;

import java.util.Scanner;

public class GeekPattern6 {

	public static void main(String[] args) {

			Scanner scn = new Scanner(System.in);
			
			System.out.println("Please enter the height of Pyramid");
			
			int pyramid_height = scn.nextInt();
			
			System.out.println("Please enter the minimum stars in the pyramid");
			
			int min_stars = scn.nextInt();
			
			for(int i = min_stars; i<=pyramid_height; i++)
			{
				for(int j = pyramid_height; j >= i;j--)
				{
					System.out.print(" ");
				}
				
				for(int j = min_stars; j <= i;j ++)
				{
					System.out.print("* ");
				}
				
				System.out.println();
			}

	}

}
