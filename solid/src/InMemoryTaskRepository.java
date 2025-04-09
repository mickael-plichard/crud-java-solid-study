package src;

import java.util.ArrayList;
import java.util.List;

public class InMemoryTaskRepository implements TaskRepository{
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void save(Task task) {
        tasks.add(task);
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }

    @Override
    public void update(int index, boolean completed) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).setCompleted(completed);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
}
