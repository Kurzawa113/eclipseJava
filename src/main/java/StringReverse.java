
public class StringReverse {

	public static void main(String[] args) {

		
	
		String str = "United Stats Of America";
		
		String rev = reverseString(str);
		
		System.out.println(rev);
		/*
		
		1 way : forloop;
		
		
		for(int i =str.length()-1; i>=0;i--) {
			
			rev = rev+str.charAt(i);
			
	}
		System.out.println(rev);
	
		*/
	

		
		
		
		
		
		
		
		
		
}
	
	// 2 way: recursion

	private static String reverseString(String str) {
		
	if(str.isEmpty()) {
		return str;
	}else {
		
		
		
			return reverseString(str.substring(1))+str.charAt(0) ;
		
	}
		
		
		
	
				
				
				
	}
}