public class Application {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Pankaj", "123");
       try {
           executor.runCommand("ifconfig");
           executor.runCommand("  rm -rf abc.pdf");
       }catch (Exception e){
           System.out.println("Exception message "+ e.getMessage());
       }

    }
}
