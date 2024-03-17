import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scan) {
        this.todoList = list;
        this.scanner = scan;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                System.out.println("To do:");
                String newTodo = scanner.nextLine();
                todoList.add(newTodo);
            }

            if (input.equals("list")) {
                todoList.print();
            }

            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int index = Integer.valueOf(scanner.nextLine());
                todoList.remove(index);
            }

            if (input.equals("compleat")) {
                System.out.println("Which task was completed?");
                int index = Integer.valueOf(scanner.nextLine());
                todoList.compleat(index);
            }
        }
    }
    
}
