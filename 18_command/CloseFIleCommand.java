public class CloseFIleCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public CloseFIleCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.closeFile();
    }
}
