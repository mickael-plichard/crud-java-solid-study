package src;

import java.util.List;
import java.util.Scanner;

public class TaskManagerApp {
    private TaskService service;    // Dépendance injectée
    private Scanner scanner = new Scanner(System.in);

    public TaskManagerApp(TaskService service) {
        this.service = service;     // Injection via constructeur
    }

    public void start() {
        while (true) {
            System.out.println("\n=== Gestion des tâches (SOLID) ===");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Afficher les tâches");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Quitter");
            System.out.print("Choix : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Titre de la tâche : ");
                    String title = scanner.nextLine();
                    service.addTask(title);
                    System.out.println("Tâche ajoutée : " + title);
                    break;
                case 2:
                    List<Task> tasks = service.getAllTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("Aucune tâche à afficher.");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println(i + ". " + tasks.get(i).getTitle() + " [" + (tasks.get(i).isCompleted() ? "Terminée" : "En cours") + "]");
                        }
                    }
                    break;
                case 3:
                    System.out.print("Index de la tâche à marquer terminée : ");
                    int completeIndex = scanner.nextInt();
                    service.markTaskCompleted(completeIndex);
                    System.out.println("Tâche marquée comme terminée.");
                    break;
                case 4:
                    System.out.print("Index de la tâche à supprimer : ");
                    int deleteIndex = scanner.nextInt();
                    service.deleteTask(deleteIndex);
                    System.out.println("Tâche supprimée.");
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    return;
                default:
                    System.out.println("Choix invalide.");
            }
        }
    }

    public static void main(String[] args) {
        // Assemblage manuel des dépendances
        TaskRepository repository = new InMemoryTaskRepository();
        TaskService service = new TaskService(repository);
        TaskManagerApp app = new TaskManagerApp(service);
        app.start();
    }
}
