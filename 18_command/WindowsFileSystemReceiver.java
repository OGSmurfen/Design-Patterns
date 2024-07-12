public class WindowsFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file on Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file on Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file on Windows OS");
    }
}
