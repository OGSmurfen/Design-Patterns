public class FileSystemClient {
    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //Creating command and associating with receiver
        OpenFIleCommand openFIleCommand = new OpenFIleCommand(fs);

        //Creating invoker and associating with command
        FileInvoker file = new FileInvoker(openFIleCommand);

        //perfirm action on invoker object
        file.execute();

        WriteFIleCommand writeFIleCommand = new WriteFIleCommand(fs);
        file = new FileInvoker(writeFIleCommand);
        file.execute();

        CloseFIleCommand closeFIleCommand = new CloseFIleCommand(fs);
        file = new FileInvoker(closeFIleCommand);
        file.execute();

    }
}
