package src;

import java.util.List;

public class TaskService {
    private TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void addTask(String title) {
        Task task = new Task(title);
        repository.save(task);
    }

    public List<Task> getAllTasks() {
        return repository.findAll();
    }

    public void markTaskCompleted(int index) {
        repository.update(index, true);
    }

    public void deleteTask(int index) {
        repository.delete(index);
    }
}
