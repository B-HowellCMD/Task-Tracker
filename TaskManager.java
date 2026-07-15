import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        Task newTask = new Task(description);
        tasks.add(newTask);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void listTasks() {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }

    public void completeTask(int id) {
        for (Task t : tasks) {
            if (id == t.getId()) {
                t.markComplete();
            }
        }
    }

    public void deleteTask(int id) {
        tasks.removeIf(t -> t.getId() == id);
    }

}
