public class UnixFileSystemReceiver implements FileSystemReceiver{

    @Override
    public void openFile() {
        System.out.println("Opening file on Unix OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file on Unix OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file on Unix OS");
    }
}
