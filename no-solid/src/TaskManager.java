package src;

import java.util.List;

public class TaskManager {
    private TaskStorage storage = new TaskStorage();

    public void addTask(String title) {
        storage.addTask(new Task(title));
    }

    public List<Task> getAllTasks(){
        return storage.getTasks();
    }

    public void markTaskCompleted(int index) {
        storage.updateTask(index, true);
    }

    public void deleteTask(int index) {
        storage.removeTask(index);
    }
}
