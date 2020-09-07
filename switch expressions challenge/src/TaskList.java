import java.util.ArrayList;
import java.util.List;

class TaskList {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Zmywanie naczyń", Priority.LOW));
        tasks.add(new Task("Nauka programowania", Priority.URGENT));
        tasks.add(new Task("Praca", Priority.MEDIUM));
        tasks.add(new Task("Obiad", Priority.HIGH));
        tasks.add(new Task("Serial", Priority.LOW));

        tasks.forEach(System.out::println);
    }

}
