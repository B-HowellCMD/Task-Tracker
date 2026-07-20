import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        boolean running = true;

        while (running) {
            printMenu();

            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine().trim();

                    if (description.isEmpty()) {
                        System.out.println("Task description cannot be empty.");
                    } else {
                        taskManager.addTask(description);
                        System.out.println("Task added.");
                    }
                    break;

                case "2":
                    taskManager.listTasks();
                    break;

                case "3":
                    System.out.print("Enter the task ID to complete: ");
                    Integer completeId = readId(scanner);

                    if (completeId != null) {
                        taskManager.completeTask(completeId);
                    }
                    break;

                case "4":
                    System.out.print("Enter the task ID to delete: ");
                    Integer deleteId = readId(scanner);

                    if (deleteId != null) {
                        taskManager.deleteTask(deleteId);
                    }
                    break;

                case "5":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== Task Manager ===");
        System.out.println("1. Add task");
        System.out.println("2. List tasks");
        System.out.println("3. Complete task");
        System.out.println("4. Delete task");
        System.out.println("5. Exit");
    }

    private static Integer readId(Scanner scanner) {
        String input = scanner.nextLine().trim();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException exception) {
            System.out.println("Please enter a valid numeric ID.");
            return null;
        }
    }
}