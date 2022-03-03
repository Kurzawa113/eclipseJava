
public class Swap {
	
	static int a =10;
		static int b = 20;
	
	
	public static void main(String[] args) {
		
		
		
		
		
		System.out.println("before swap : "+a);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("after swap : "+a);
		
		
		int temp;
		temp =a;
		a=b;
		b=temp;
		
		System.out.println("after with temp value swap : "+a);
		
		
	}


}
