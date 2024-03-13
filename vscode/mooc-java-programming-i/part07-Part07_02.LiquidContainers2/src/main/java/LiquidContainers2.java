
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: " + container1);
            System.out.println("Second: " + container2);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (input.equals("quit") || parts.length == 1) {
                break;
            }

            int value = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                container1.add(value);
            }

            if (command.equals("remove")) {
                container2.remove(value);
            }

            if (command.equals("move")) {
                if (container1.contains() < value) {
                    container2.add(container1.contains());
                    container1.remove(value);
                    continue;
                }
                container1.remove(value);
                container2.add(value);
            }

        }
    }

}
