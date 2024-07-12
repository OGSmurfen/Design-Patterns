import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String filePath = "D:\\Java\\SOLID\\10_adapterExercise\\students.txt";
        StudentFileReader studentFileReader = new StudentFileReader(filePath);
        ArrayList<Student>students = new ArrayList<>();

        students.add(studentFileReader.extractValues());

        System.out.println(students.get(0));

    }
}
