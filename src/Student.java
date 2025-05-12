
public class Student {
	
	private int id;
	private String lastname;
	private String firstname;
	private double gradeAverage;
	
	public Student(int id, String lastname, String firstname, double gradeAverage) {
		this.id = id;
		this.lastname = lastname;
		this.firstname = firstname;
		this.gradeAverage = gradeAverage;
	}

	public long getId() {
		return id;
	}

	public String getLastname() {
		return lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public double getGradeAverage() {
		return gradeAverage;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", nachname=" + lastname + ", vorname=" + firstname + ", notenschnitt="
				+ gradeAverage + "]";
	}
}
