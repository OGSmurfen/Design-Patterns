import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentFileReader {

    private final String filePath;

    public StudentFileReader(String filePath) {
        this.filePath = filePath;
    }
    public Student extractValues(){
        Student s;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;


            while (((line = reader.readLine()) != null)) {
                ArrayList<String> parts = new ArrayList<String>();
                parts.add(Arrays.toString(line.split(" "))) ;
                StudentFileReaderAdapter studentFileReaderAdapter
                        = new StudentFileReaderAdapterClassImpl(filePath, parts.get(0), Integer.getInteger(parts.get(1)));
                s = studentFileReaderAdapter.getNewStudent();
                return s;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new Student("penis", 0);
    }


    public void readAndPrintFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void processLine(String line) {
        // Assuming the format is "student name, student id"
        String[] parts = line.split(" ");
        if (parts.length == 2) {
            String studentName = parts[0].trim();
            String studentId = parts[1].trim();
            System.out.println("Student Name: " + studentName + ", Student ID: " + studentId);
        } else {
            System.out.println("Invalid format: " + line);
        }
    }
}
