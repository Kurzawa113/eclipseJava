package interview2;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {
	
	public static void main(String[] args) {
		System.out.println("How to iterate map and get value and key: ");
		System.out.println();

		Map<Integer, String> mapItr = new HashMap<Integer, String>();

		mapItr.put(1, "Model-s");
		mapItr.put(2, "F-150");
		mapItr.put(3, "RangeRover");
		mapItr.put(4, "4Runner");

		for (Integer i : mapItr.keySet()) {

			System.out.println("Key value = " + i);
			System.out.println("Value  = " + mapItr.get(i));
			System.out.println();
		}

	}

}
