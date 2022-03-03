
public class FctorialRecursionDemo {
	public static void main(String[] args) {
		
		
		
	System.out.println(	factorialNum(5));
		
		
		
		
		
	}
	
	private static int factorialNum(int num) {
	
		
		if(num==0) {
			return 1;
		}
		
		
		
		return num*factorialNum(num-1);
	}

}
