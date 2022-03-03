
public class FirstNonRepeatedCharacterInString {
	
	
	public static void main(String[] args) {
		
		String inputStr ="tteacher";
		
		char []ch = inputStr.toCharArray();

        for(char i :ch){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
		
		
		
	}

}
