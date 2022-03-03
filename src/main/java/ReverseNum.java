
public class ReverseNum {

	public static void main(String[] args) {
		
		
		Integer num = 123;
		String numString = String.valueOf(num);
		
		String rev = "";
		
		for(int i=numString.length()-1; i >=0;i--) {
			rev = rev + numString.charAt(i);
		}
		
	
		System.out.println(Integer.valueOf(rev));
		
	
	}

}
