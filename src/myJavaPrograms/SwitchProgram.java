package myJavaPrograms;

import java.util.Scanner;

public class SwitchProgram {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter the operator which you want to solve.");

		char operator = scn.next().charAt(0);

        System.out.println("Enter the value of num1 and num2.");

		int num1 = scn.nextInt();

		int num2 = scn.nextInt();

		int result = 0;

		switch (operator) {

		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;

		default:
			System.out.print("Invalid operator!!!");

		}
		System.out.println(result);
	}
	}

