import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateOrNot {
	public static void main(String[] args) {
		
		
		
		
		List<String> list = new ArrayList<String>( );
		list.add("Apple");
		list.add("Manogo");
		list.add("Apple");
		
		Set<String> noDuplicate  =new HashSet<String>(list);
		if(noDuplicate.size() != list.size()) {
			System.out.println(" there is duplicate");
		}else {
			System.out.println("there is no duplicate");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
