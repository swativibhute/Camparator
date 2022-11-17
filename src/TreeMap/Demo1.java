package TreeMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("Swati", 4);
		map.put("Abhi", 3);
		map.put("Varsha", 7);
		map.put("Priya", 2);
		map.put("Babita", 5);

		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, new SortDe());
		System.out.println(list);
	}

}
