
import java.util.*;
import java.nio.file.*;
import java.io.IOException;

public class Main {

    static Student student = new Student(
        101, "Sample Student", "student@example.com",
        "Computer Science and Technology", "MCA", 1
    );

    static Staff teacher = new Staff(
        201, "Sample Teacher", "teacher@example.com",
        "Computer Science and Technology",
        "Assistant Professor", true, 50000
    );

    static Staff staff = new Staff(
        301, "Sample Staff", "staff@example.com",
        "Computer Science and Technology",
        "Office Assistant", false, 25000
    );

    static List<AcademicActivity> academicActivities =
        Arrays.asList(
            new AcademicActivity("ISA", "2023-24",
                "Internal assessment - sample"),
            new AcademicActivity("Midpoint", "2024-25",
                "Mid-semester assessment - sample"),
            new AcademicActivity("SEA", "2025-26",
                "Semester-end assessment - sample"),
            new AcademicActivity("Study Tour", "2025-26",
                "Educational visit - sample"),
            new AcademicActivity("Placement Activities", "2025-26",
                "Career guidance - sample")
        );

    static List<NonAcademicActivity> otherActivities =
        Arrays.asList(
            new NonAcademicActivity("InfoFest", "2023-24",
                "Technical festival - sample"),
            new NonAcademicActivity("Plateaunia", "2024-25",
                "Cultural event - sample"),
            new NonAcademicActivity("Play-on", "2025-26",
                "Sports event - sample")
        );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== DCST NIRF REPORTING SYSTEM =====");
            System.out.println("1. Student Details");
            System.out.println("2. Teaching and Non-Teaching Staff");
            System.out.println("3. Academic Activities");
            System.out.println("4. Non-Academic Activities");
            System.out.println("5. Programs and Subjects");
            System.out.println("6. OOP Demonstrations");
            System.out.println("7. Generate and Save Report");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            while (!sc.hasNextInt()) {
                System.out.print("Enter a number: ");
                sc.next();
            }

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    student.displayDetails(true);
                    break;

                case 2:
                    ReportService.sendForReporting(teacher);
                    ReportService.sendForReporting(staff);
                    System.out.println(
                        "Sample teacher pay: Rs. " +
                        teacher.calculatePay()
                    );
                    break;

                case 3:
                    for (AcademicActivity a : academicActivities) {
                        a.display();
                    }
                    break;

                case 4:
                    for (NonAcademicActivity a : otherActivities) {
                        System.out.println(a);
                    }
                    break;

                case 5:
                    System.out.println("Department: DCST, Goa University");
                    System.out.println("Program: MCA (verify official offerings)");
                    System.out.println("Example subjects: OOP, Operating Systems,");
                    System.out.println("Data Science, Internet Technologies, Mathematics");
                    break;

                case 6:
                    demonstrateOOP();
                    break;

                case 7:
                    generateReport();
                    break;

                case 0:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }

    static void demonstrateOOP() {
        System.out.println("\n--- OOP DEMONSTRATIONS ---");

        // Object referencing
        Student reference = student;
        reference.setName("Name changed through shared reference");
        System.out.println("Shared object name: " + student.name);
        student.setName("Sample Student");

        // Static members and enums
        System.out.println("Member type: " + student.getType());
        Member.displayMemberCount();

        // Abstract class, overriding and message passing
        Person person = student;
        System.out.println("Role: " + person.getRole());
        ReportService.sendForReporting(student);

        // Access modifiers
        student.showAccessLevels();
        student.showDepartmentFromSubclass();

        // Method overloading
        student.displayDetails();
        student.displayDetails(true);

        // Collections and generics
        ReportService.showCollections();

        // Exception handling and validation
        ReportService.showExceptionHandling(student);

        // Reflection
        ReportService.showReflection(student);

        // Multiple interface inheritance explanation
        ReportService.showInheritanceExplanation();

        // Cloning
        try {
            CloneDemo.run();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning failed: " + e.getMessage());
        }
    }

    static void generateReport() {
        List<String> lines = new ArrayList<>();

        lines.add("DCST NIRF REPORT - SAMPLE");
        lines.add("Goa University");
        lines.add("");
        lines.add("IMPORTANT: These are illustrative sample records.");
        lines.add("Verify all information before official use.");
        lines.add("");
        lines.add("STUDENT DETAILS");
        lines.add(student.toString());
        lines.add("Email: " + student.getEmail());
        lines.add("");
        lines.add("STAFF DETAILS");
        lines.add(teacher.toString());
        lines.add(staff.toString());
        lines.add("");
        lines.add("ACADEMIC ACTIVITIES");

        for (AcademicActivity a : academicActivities) {
            lines.add(a.toString());
        }

        lines.add("");
        lines.add("NON-ACADEMIC ACTIVITIES");

        for (NonAcademicActivity a : otherActivities) {
            lines.add(a.toString());
        }

        lines.add("");
        lines.add("PROGRAM: MCA (verify official offerings)");
        lines.add("SUBJECTS: OOP, OS, Data Science, Internet Technologies, Mathematics");

        try {
            Files.write(Paths.get("nirf_report.txt"), lines);
            System.out.println("Report saved to nirf_report.txt");
        } catch (IOException e) {
            System.out.println("Could not save report: " + e.getMessage());
        } finally {
            System.out.println("Report operation finished.");
        }
    }
}
