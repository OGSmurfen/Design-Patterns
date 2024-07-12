public class Main {
    public static void main(String[] args) {
        testAbstractFactory();
    }

    private static void testAbstractFactory() {
        Computer pc = ComputerFactory.getComputer(new DesktopComputerFactory("64GB", "2TB", "Intel i9"));
        Computer server = ComputerFactory.getComputer(new ServerComputerFactory("128GB", "100TB", "Intel i12"));
        System.out.println("Abstract factory pc config:: "+pc);
        System.out.println("Abstract factory server config:: "+server);
    }
}
