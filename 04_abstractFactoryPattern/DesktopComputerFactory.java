public class DesktopComputerFactory implements ComputerAbstractFactory{
    private String ram;
    private String hdd;
    private String cpu;

    public DesktopComputerFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new DesktopComputer(ram, hdd, cpu);
    }
}
