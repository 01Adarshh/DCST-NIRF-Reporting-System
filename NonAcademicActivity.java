
public class NonAcademicActivity {
    private String name;
    private String academicYear;
    private String category;

    public NonAcademicActivity(String name, String academicYear,
                               String category) {
        this.name = name;
        this.academicYear = academicYear;
        this.category = category;
    }

    @Override
    public String toString() {
        return name + " (" + academicYear + ") - " + category;
    }
}
