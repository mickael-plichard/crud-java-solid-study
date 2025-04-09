package src;

import java.util.List;

public interface TaskRepository {
    void save(Task task);
    List<Task> findAll();
    void update(int index, boolean completed);
    void delete(int index);
}
