
public class Student extends Member
        implements CampusMember, Cloneable {

    private String program;
    private int year;

    public Student(int id, String name, String email,
                   String department, String program, int year) {
        super(id, name, email, department, MemberType.STUDENT);
        this.program = program;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }

    @Override
    public void generateReport() {
        System.out.println(
            "Student report: " + name + " | " + program +
            " | Year " + year
        );
    }

    @Override
    public void printDetails() {
        System.out.println(
            "Student: " + name + " (ID " + getId() + ")"
        );
    }

    // Method overloading: no parameter
    public void displayDetails() {
        System.out.println(toString());
    }

    // Method overloading: boolean parameter
    public void displayDetails(boolean includeEmail) {
        System.out.println(toString());

        if (includeEmail) {
            System.out.println("Email: " + getEmail());
        }
    }

    public void showDepartmentFromSubclass() {
        System.out.println(
            "Protected department accessed in subclass: " +
            department
        );
    }

    @Override
    public String toString() {
        return getId() + " - " + name + " - " +
               program + " - Year " + year;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
