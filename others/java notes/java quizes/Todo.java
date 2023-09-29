import java.util.*;

public class Todo {
    private static final String MENU =
        "1. Add a task\n" +
        "2. Remove a task\n" +
        "3. Mark a task as completed\n" +
        "4. Display all tasks\n" +
        "5. Quit\n";
    private static final String PROMPT = "> ";
    private List<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Todo todo = new Todo();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.print(MENU + PROMPT);
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    todo.addTask(task);
                    break;
                case 2:
                    System.out.print("Select task index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    todo.remove(index);
                    break;
                case 3:
                    System.out.print("Enter task index: ");
                    int index2 = sc.nextInt();
                    sc.nextLine();
                    todo.markTaskAsCompleted(index2);
                    break; 
                case 4:
                    todo.displayAllTasks();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void remove(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, tasks.get(index) + " (completed)");
        } else {
            System.out.println("Invalid index");
        }
    }

    public void displayAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(i + ". " + tasks.get(i));
            }
        }
    }
}
