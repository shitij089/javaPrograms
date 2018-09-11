package myJavaPrograms;

import java.util.Scanner;

public class SecondProgramIfElse {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.println("Eneter the number");
		
		int num = scn.nextInt();
		
		if(num%2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number");
		}

	}

}
