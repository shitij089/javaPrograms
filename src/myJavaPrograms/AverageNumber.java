package myJavaPrograms;

import java.util.Scanner;

public class AverageNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the num of elements in an array...");
		
		int num = scn.nextInt();
		
		int[] arr = new int[num];
		
		int sum = 0;
		
		System.out.println("Elements in an array are given as:");
		
		for( int i = 0;i<arr.length;i++)
		{
			
			arr[i] = scn.nextInt();
		}
		
		for( int i = 0; i<arr.length;i++)
		{
			sum = sum + arr[i];
		}
		
		int avg = sum / arr.length;
		
		System.out.println("Average of the given numbers is:" + avg);
	}

}
