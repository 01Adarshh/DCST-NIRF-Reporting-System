public class CampusActivity {
    private String name;
    private String category;
    private String academicYear;

    public CampusActivity(String name, String category, String academicYear) {
        this.name = name;
        this.category = category;
        this.academicYear = academicYear;
    }

    public void display() {
        System.out.println(name + " [" + category + "] - " + academicYear);
    }

    @Override
    public String toString() { return name + " [" + category + "] - " + academicYear; }
}
