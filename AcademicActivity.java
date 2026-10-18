
public class AcademicActivity {
    private String name;
    private String academicYear;
    private String description;

    public AcademicActivity(String name, String academicYear,
                           String description) {
        this.name = name;
        this.academicYear = academicYear;
        this.description = description;
    }

    public void display() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + " (" + academicYear + "): " + description;
    }
}
