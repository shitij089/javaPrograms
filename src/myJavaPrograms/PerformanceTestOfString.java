package myJavaPrograms;

public class PerformanceTestOfString {
	
	
	public static String ConcatWithString()  {
		
			String s = "Shitij";
			
			String s2 = s.concat("Khanna");
			
			return s2;
	}
	
	public static String ConcatWithStringBuffer() {
		
			StringBuffer sb = new StringBuffer("Shitij");
			
			sb.append("Khanna");
			
			return sb.toString();
	}

	public static void main(String[] args) {

		 long startTime = System.currentTimeMillis();  
	        ConcatWithString();  
	        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
	        startTime = System.currentTimeMillis();  
	        ConcatWithStringBuffer();  
	        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  
		
		

	}

}
