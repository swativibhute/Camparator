package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Swati", 2);
		map.put("Amit", 3);
		map.put("Babita", 5);
		map.put("Rahul", 1);
		map.put("Yasin", 4);
		System.out.println(map);
		
		System.out.println();

		System.out.println("Sort Map by keys >>>>>>>");
		TreeMap<String, Integer> map2 = new TreeMap<String, Integer>(map);
		System.out.println(map2);

		List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(list, new Sortvalues());
		Map<String, Integer> map3 = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			map3.put(entry.getKey(),entry.getValue());
		}
		System.out.println();
		System.out.println("sort Map by values in descending order using Comparator >>>>>>");
		System.out.println(map3);
	}
}
