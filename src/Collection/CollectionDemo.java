package Collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		Set<Student> s = new TreeSet<>(new IdComparator());
		s.add(new Student(1, "Vishal", "Hindi"));
		s.add(new Student(2, "isha", "English"));
		s.add(new Student(3, "Prisha", "German"));
		
		
		for (Student student : s) {
			System.out.println(student);
		}
	}
}
