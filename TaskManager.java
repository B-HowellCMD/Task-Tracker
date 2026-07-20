import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void completeTask(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markComplete();
                System.out.println("Task #" + id + " completed.");
                return;
            }
        }

        System.out.println("Task #" + id + " was not found.");
    }

    public void deleteTask(int id) {
        boolean removed = tasks.removeIf(task -> task.getId() == id);

        if (removed) {
            System.out.println("Task #" + id + " deleted.");
        } else {
            System.out.println("Task #" + id + " was not found.");
        }
    }
}