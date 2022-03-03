import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {
	public static void main(String[] args) {
		
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("before reversing: "+list);
		
		Collections.reverse(list);
		
		System.out.println("After reversing: "+ list );
		
		
		
		
	}

}
