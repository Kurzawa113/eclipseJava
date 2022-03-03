import java.util.Arrays;

public class SortString {
	
	public static void main(String args[]) {
		
		
		String  str = "Golden";
		char ch[] = str.toCharArray();
		Arrays.sort(ch);
		String str2 = new String(ch);

		System.out.println(str2);
	}
	
	
	

}
