package interview2;

public class OccuranceOfCharacter {
	public static void main(String[] args) {
		
		
	String st ="you will lose if you quit"	;
	
	int orginalLength = st.length();
	
	int lengthAfterRemove = st.replace("o", "").length();
		
	int count  = orginalLength-lengthAfterRemove;
	
	System.out.println("occurance of  o : "+ count);
		
		
		
		
		
	}

}
