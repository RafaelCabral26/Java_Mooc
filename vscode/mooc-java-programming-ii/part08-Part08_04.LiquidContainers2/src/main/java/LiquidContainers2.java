
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContainerManager manager = new ContainerManager();

        while (true) {
            System.out.print(manager);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int number = Integer.valueOf(splitInput[1]);

            if (command.equals("add")) {
                manager.addLiquid(number);
            }

            if (command.equals("remove")) {
                manager.removeLiquid(number);
            }

            if (command.equals("move")) {
                manager.move(number);
            }
        }
    }

}
