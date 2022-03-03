
public class CharacterCount {
	
	static int i,c=0,res;
	static String s =" Mancheste runited also know as Red Devil";

	
	static int 	characterCount(String s){
	
	
		try {
			
			for(i=0,c=0;i<s.length();i++,c++) {
				s.charAt(i);
			
			}
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
	
		}
	return c;
	}
	

	public static void main(String[] args) {
		
		
res =	CharacterCount.characterCount(s);
		
		System.out.println(res);
	

	}
	

	

}
