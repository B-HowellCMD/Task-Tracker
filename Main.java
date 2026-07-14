
public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            printUsage();
            return;
        }
        String command = args[0];
        String taskDescription = args[1];

        if (command.equalsIgnoreCase("add")) {
            System.out.println("Task added:" + taskDescription);
        } else {
            System.out.println("Unknown Command" + command);
        }
    }

    private static void printUsage() {
        System.out.println("Usage");
        System.out.println(" java TaskTracker add \"Task description\"");
    }
}