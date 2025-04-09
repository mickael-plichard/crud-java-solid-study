package src;

import java.util.ArrayList;
import java.util.List;

public class TaskStorage {
    private List<Task> tasks = new ArrayList<>();

    public void addTask (Task task) {
        tasks.add(task);
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void updateTask(int index, boolean completed) {
        if (index >= 0 && index < tasks.size()){
            tasks.get(index).setCompleted(completed);
        }
    }

    public void removeTask(int index) {
        if (index >=0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
}
