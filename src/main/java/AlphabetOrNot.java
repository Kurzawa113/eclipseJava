import java.util.Scanner;

public class AlphabetOrNot {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter character: ");
		char ch = sc.next().charAt(0);
		
		if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
			System.out.println("given character is Alphabet" );
		}else {
			System.out.println("given character is not Alphabet");
		}
		sc.close();
		
		
		
}

}
