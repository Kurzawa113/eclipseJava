
public class CharCount {
	
		static int i , c=0, result;
		static int countChar(String s) {
		for(i=0,c=0;i<s.length();i++) {
				char ch = s.charAt(i);
			if(ch!=' ') {
			
				c++;
				
			}
		}			
			
			
			return c;
			
		}
		
	
	
	
	
	
	public static void main(String[] args) {
		String s ="  manchester united is also known as red devil";
		
	result =	CharCount.countChar(s);
	System.out.println(result	);
	
	
}

}
