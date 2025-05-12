public class SchoolApp {

    public static void main(String[] args) {
        School school = new School();
        Student s1 = new Student(1, "Müller", "Heinrich", 4.5);
        Student s2 = new Student(2, "Müller", "Franz", 4);
        Student s3 = new Student(5, "Altenbach", "Alfons", 3.5);
        Student s4 = new Student(3, "Bärtschi", "Fritz", 6);
        Student s5 = new Student(4, "Yule", "Didi", 5.5);

        school.addStudent(s1);
        school.addStudent(s2);
        school.addStudent(s3);
        school.addStudent(s4);
        school.addStudent(s5);

        school.print();
    }
}
