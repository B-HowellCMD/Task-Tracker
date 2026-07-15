public class Task {
    private static int nextId = 1;
    private final int id;
    private String description;
    private boolean completed;

    public Task(String description) {
        this.id = nextId++;      // assign from nextId, then bump nextId
        this.completed = false;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void markComplete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        if (completed) {
            return "#" + id + " [x] " + description;
        } else {
            return "#" + id + " [ ] " + description;
        }
    }
}