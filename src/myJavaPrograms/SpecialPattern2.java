package myJavaPrograms;

import java.util.Scanner;

public class SpecialPattern2 {

//	public static void main(String[] args) {
//		
//		for(int i = 1;i<=8;i++)
//		{
//			for(int j = 1;j<=8;j++)
//			{
//				if( i==1 && j==1)
//				{
//					System.out.print("*");
//					j++;
//				}
//				
//				
//				if((i==2) && (j==7 || j==8))
//				{
//					System.out.print("*");
//					//j++;
//				}
//				else {
//				System.out.print("#");
//				}
//			}
//			
//			System.out.println();
//		}
//	}
	
	
	public static void main(String args[]) {
		int size;
		System.out.println("enter the size ");
		Scanner in = new Scanner(System.in);
		size = in.nextInt();
		int s_count = 1;
		int hash_count = size-1;
		for(int  i = 0;i<size/2;i++)
		{
			
		if(s_count %2 != 0) {
			star_print(s_count);
			hash_print(hash_count);
		}
		else {
			hash_print(hash_count);
			star_print(s_count);
		}
		s_count++;
		hash_count--;
		System.out.println();
		}
		
		for(int i=0;i<size/2;i++) {
			s_count--;
			hash_count++;
		if(s_count%2 == 0) {
			star_print(s_count);
			hash_print(hash_count);	
		}
		else {
			hash_print(hash_count);
			star_print(s_count);
		}
		
		
		System.out.println();
		}
		}
	public static void star_print(int s_count) {
		
for(int i = 0;i<s_count;i++) {
	System.out.print("*");
}
	}
	public static void hash_print(int hash_count) {
		for(int i = 0;i<hash_count;i++) {
			System.out.print("#");
		}
	}
	
}