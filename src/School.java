import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class School {

	private List<Student> students = new ArrayList<Student>();
	
	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	public void print() {
		this.students.forEach(System.out::println);
	}
}
