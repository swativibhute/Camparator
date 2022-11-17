package TreeMap;

import java.util.Comparator;
import java.util.Map.Entry;

public class SortDe implements Comparator<Entry<String, Integer>> {
	@Override
	public int compare(Entry o1, Entry o2) {
		return -((Integer) o1.getValue()).compareTo((Integer)o2.getValue());
	}

}
