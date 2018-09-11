package myJavaPrograms;

public class CopyArray {

	public static void main(String[] args) {

		int[] a = {20, 15, 11, 51, 44};
		
		int b[] = a.clone();
		
		for(int i = 0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	    
	    System.out.println("..........................");
	    
	    a[2] = 0;
	    
	    System.out.println(b[2]);
		
	}

}
