
import java.lang.reflect.Field;
import java.util.*;

public class ReportService {

    // Message passing through an interface
    public static void sendForReporting(Reportable item) {
        item.generateReport();
    }

    // Generic method
    public static <T> void printItems(Collection<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void showCollections() {
        List<String> activities = Arrays.asList(
            "ISA", "Midpoint", "SEA", "Study Tour", "Placements"
        );

        Queue<String> pending = new LinkedList<>();
        pending.offer("Verify student details");
        pending.offer("Verify staff details");

        Set<String> events = new LinkedHashSet<>(
            Arrays.asList("InfoFest", "Plateaunia",
                          "Play-on", "InfoFest")
        );

        Map<String, String> courses = new LinkedHashMap<>();
        courses.put("MCA", "Master of Computer Applications");
        courses.put("BCA", "Bachelor of Computer Applications");

        System.out.println("Activity List: " + activities);
        System.out.println("Pending Tasks Queue: " + pending);
        System.out.println("Events Set: " + events);
        System.out.println("Course Map: " + courses);

        DataStore<Student> store = new DataStore<>();
        store.add(new Student(
            102, "Example Student", "example@example.com",
            "Computer Science and Technology", "MCA", 1
        ));

        System.out.println("Generic DataStore:");
        printItems(store.getAll());
    }

    public static void showExceptionHandling(Student student) {
        try {
            if (student.getProgram() == null ||
                student.getProgram().isBlank()) {
                throw new InvalidRecordException(
                    "Student program cannot be empty."
                );
            }

            System.out.println("Student record validated successfully.");

            int result = 10 / 0;
            System.out.println(result);

        } catch (InvalidRecordException e) {
            System.out.println("Validation error: " + e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println("Exception handled: division by zero.");

        } finally {
            System.out.println("Validation process finished.");
        }
    }

    public static void showReflection(Student student) {
        Class<?> studentClass = student.getClass();

        System.out.println(
            "Runtime class name: " + studentClass.getName()
        );

        System.out.print("Declared fields: ");

        Field[] fields = studentClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.print(field.getName() + " ");
        }

        System.out.println();
    }

    public static void showInheritanceExplanation() {
        System.out.println(
            "Java classes cannot extend multiple classes."
        );

        System.out.println(
            "Student extends Member and implements CampusMember."
        );

        System.out.println(
            "CampusMember extends Reportable and Printable."
        );

        System.out.println(
            "This demonstrates multiple interface inheritance."
        );
    }
}
