public class StudentFileReaderAdapterClassImpl extends StudentFileReader implements StudentFileReaderAdapter{
    private String name;
    private int id;
    public StudentFileReaderAdapterClassImpl(String filePath, String name, int id) {
        super(filePath);
        this.name = name;
        this.id = id;
    }

    @Override
    public Student getNewStudent() {
        Student s = new Student(name, id);
        return null;
    }
}
