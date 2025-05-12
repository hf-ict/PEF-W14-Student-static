
public class Student {
	
	private int id;
	private String nachname;
	private String vorname;
	private double notenschnitt;
	
	public Student(int id, String nachname, String vorname, double notenschnitt) {
		this.id = id;
		this.nachname = nachname;
		this.vorname = vorname;
		this.notenschnitt = notenschnitt;
	}

	public long getId() {
		return id;
	}

	public String getNachname() {
		return nachname;
	}

	public String getVorname() {
		return vorname;
	}

	public double getNotenschnitt() {
		return notenschnitt;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", nachname=" + nachname + ", vorname=" + vorname + ", notenschnitt="
				+ notenschnitt + "]";
	}
}
