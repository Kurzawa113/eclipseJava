import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapArrayList {
	
	public static void main(String[] args) {
		
		
		
		List<Integer> num = new ArrayList<Integer>();
		
		
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		System.out.println("before swap: "+num);
		System.out.println("After swap");
		Collections.swap(num, 1,2);
		Collections.swap(num, 0,3);
		
		System.out.println(num);
		
		
		
		
	}

}
