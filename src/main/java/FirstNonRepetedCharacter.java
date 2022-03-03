
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
public class FirstNonRepetedCharacter {
	
	public static void main(String[] args) {
		
		
		
		char  c =getFirstNonRepeatChar("aabbccdffg");
		System.out.println("Non repeated Character=  "+c );
		
	}
	private static	char getFirstNonRepeatChar(String st) {
			
	
		
		Map<Character,Integer> countMap = new LinkedHashMap<Character, Integer>();
		
		for(char ch : st.toCharArray()) {
			countMap.put(ch,countMap.containsKey(ch)? countMap.get(ch) +1:1);
			
	
		}
		for(Entry<Character,Integer> entry:countMap.entrySet() ) {
			if(entry.getValue()==1) {
			return	entry.getKey();
			}
		}
		throw new RuntimeException("didn't find any non repeatcharacter");
		
		}
			
		
	
	}
		
		
		
		
		
		
		
	


