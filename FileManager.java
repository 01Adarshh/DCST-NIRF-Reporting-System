
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileManager {

    public static void saveReport(List<String> lines,
                                  String fileName) {
        try {
            Files.write(Path.of(fileName), lines);

            System.out.println(
                "Report saved to: " +
                Path.of(fileName).toAbsolutePath()
            );

        } catch (IOException e) {
            System.out.println(
                "Error saving report: " + e.getMessage()
            );

        } finally {
            System.out.println("File operation completed.");
        }
    }
}
