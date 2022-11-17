package HashSet;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class HashSetCom {

	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student("Swati"));
		set.add(new Student("Sakshi"));
		set.add(new Student("Priyay"));
		set.add(new Student("Aarav"));
		set.add(new Student("Issha"));
		
		List<Student> list = new LinkedList<Student>(set);
		Collections.sort(list,new CampareString() );
				
		System.out.println(list);
	}
}
