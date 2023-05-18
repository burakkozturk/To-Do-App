import java.util.ArrayList;
import java.util.List;

public class ToDoApp {
    private List<String> tasks;

    public ToDoApp() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Görev eklendi: " + task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String removedTask = tasks.remove(index);
            System.out.println("Görev silindi: " + removedTask);
        } else {
            System.out.println("Geçersiz görev indeksi!");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Yapılacak bir görev bulunmuyor.");
        } else {
            System.out.println("Yapılacaklar Listesi:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}