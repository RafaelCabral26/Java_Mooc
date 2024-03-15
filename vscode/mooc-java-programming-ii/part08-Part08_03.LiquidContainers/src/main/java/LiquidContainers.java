
import java.util.Arrays;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container = new Container();

        while (true) {
            System.out.print(container);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] splitInput = input.split(" ");
            String command = splitInput[0];
            int number = Integer.valueOf(splitInput[1]);

            if (command.equals("add")) {
                container.add(number);
            }

            if (command.equals("move")) {
                container.move(number);
            }

            if (command.equals("remove")) {
                container.remove(number);
            }

        }
    }

}
