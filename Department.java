
import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String university;
    private List<String> programs;
    private List<String> subjects;

    public Department(String name, String university,
                      List<String> programs, List<String> subjects) {
        this.name = name;
        this.university = university;
        this.programs = new ArrayList<>(programs);
        this.subjects = new ArrayList<>(subjects);
    }

    public void display() {
        System.out.println(name + " - " + university);
        System.out.println("Programs: " + programs);
        System.out.println("Subjects: " + subjects);
    }

    @Override
    public String toString() {
        return name + " - " + university
            + "\nPrograms: " + programs
            + "\nSubjects: " + subjects;
    }
}
