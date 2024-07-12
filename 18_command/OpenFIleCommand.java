public class OpenFIleCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public OpenFIleCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        //forwarding request to openFile method
        this.fileSystemReceiver.openFile();
    }
}
