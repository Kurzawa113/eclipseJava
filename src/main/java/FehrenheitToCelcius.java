import java.util.Scanner;

public class FehrenheitToCelcius {
	
	public static void main(String[] args) {
		
		
		float temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter temperator:  ");
		temp = sc.nextFloat();
		temp = (temp-32)*5/9;
		System.out.println("temp in Celcius:  "+ temp);
		sc.close();
		
	}

}
