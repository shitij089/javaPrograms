package myJavaPrograms;

public class SpecialPattern3 {

	public static void main(String[] args) {

		for(int i = 1;i<=3;i++)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i % 2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i = 3;i>=1;i--)
		{
			for(int j = 1;j<=i;j++)
			{
				if(i % 2!=0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
