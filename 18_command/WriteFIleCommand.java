public class WriteFIleCommand implements Command{
    private FileSystemReceiver fileSystemReceiver;

    public WriteFIleCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        this.fileSystemReceiver.writeFile();
    }
}
