import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StudentList {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();
 		HashSet<Student> hs = new HashSet<Student>();
		list.add(new Student(101, "Swati", "Kothali", 416101));
		list.add(new Student(106, "Amita", "Jaysingpur",416102));
		list.add(new Student(103, "Akshy", "Udgoan",416105));
		list.add(new Student(105, "Smita", "Danoli",416109));
		list.add(new Student(102, "Aarav", "Kavtesar",416112));
		list.add(new Student(104, "Priyay", "Shirol",416132));

		System.out.println("befor Sorting>>>>>>>>>>>>>>");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println(list);
		//Collections.sort(hs, new CampareById());
		Collections.sort(list,new CampareById());
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("After Sorting>>>>>>>>>>>>>>");

		System.out.println(list);
		System.out.println("----------------------------------------------------------------------------");

		System.out.println("Reverse Order>>>>>>");
		Collections.reverseOrder(new CampareById())	;
		
		}

}
