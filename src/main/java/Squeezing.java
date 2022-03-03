
public class Squeezing {
	
	static int i;
	  static int  count =0;
	    
	    static void squeeze(String s) {
	    	for(int i =0; i<s.length(); i++) {
	    		char ch = s.charAt(i); 
	    		if(ch!=' ') {
	    			count++;
	    			System.out.print(ch);	    		}
	    	}
	    }
	    
	    
	    
	    public static void main (String args[])
	    
	    {
	    	
	    	
	        String s = "   manchester united is also known as red devil    ";
	System.out.println("After Squeeze: ");
	       Squeezing.squeeze(s);
	    }

}
