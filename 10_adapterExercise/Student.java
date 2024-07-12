public class Student {
    private String name;
    private int facNr;

    public Student(String name, int facNr) {
        this.name = name;
        this.facNr = facNr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFacNr() {
        return facNr;
    }

    public void setFacNr(int facNr) {
        this.facNr = facNr;
    }
}
