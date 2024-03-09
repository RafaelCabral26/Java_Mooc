import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private TodoList todo;
    private Scanner scan;

    public UserInterface(TodoList todo, Scanner scan) {
        this.todo = todo;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scan.nextLine();
            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                System.out.println("To add:");
                String toAdd = scan.nextLine();
                todo.add(toAdd);
                continue;
            }

            if (input.equals("list")) {
                todo.print();
                continue;
            }

            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(scan.nextLine());
                todo.remove(removed);
                continue;
            }
        }
    }
}
