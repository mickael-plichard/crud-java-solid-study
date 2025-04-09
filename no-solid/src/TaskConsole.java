package src;

import java.util.List;
import java.util.Scanner;

public class TaskConsole {
    private TaskManager manager = new TaskManager();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n=== Gestion des tâches ===");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Afficher les tâches");
            System.out.println("3. Marquer une tâche comme terminée");
            System.out.println("4. Supprimer une tâche");
            System.out.println("5. Quitter");
            System.out.print("Choix: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Titre de la tâche: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    System.out.println("Tâche ajoutée: " + title);
                    break;
                case 2:
                    List<Task> tasks = manager.getAllTasks();
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
                    manager.markTaskCompleted(completeIndex);
                    System.out.println("Tâche marquée comme terminée.");
                    break;
                case 4:
                    System.out.print("Index de la tâche à supprimer : ");
                    int deleteIndex = scanner.nextInt();
                    manager.deleteTask(deleteIndex);
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
        TaskConsole console = new TaskConsole();
        console.start();
    }
}
