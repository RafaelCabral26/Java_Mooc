
import java.util.ArrayList;
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] container = { 0, 0 };
        while (true) {
            System.out.println("First: " + container[0] + "/100");
            System.out.println("Second: " + container[1] + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (command.equals("quit") || parts.length == 1) {
                break;
            }
            int value = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (value < 0) {
                    continue;
                } else if (container[0] + value > 100) {
                    container[0] = 100;
                    continue;
                }
                container[0] += value;
            }

            if (command.equals("move")) {
                if (value < 0) {
                    continue;
                }

                if (container[0] < value) {
                    container[1] += container[0];
                    container[0] -= value;
                    if (container[0] < 0) {
                        container[0] = 0;
                    }
                    continue;
                }
                container[0] -= value;
                container[1] += value;

                if (container[1] > 100) {
                    container[1] = 100;
                }

            }

            if (command.equals("remove")) {
                if (value < 0) {
                    continue;
                }

                if (container[1] < value) {
                    container[1] = 0;
                    continue;
                }
                
                container[1] -= value;
            }
        }
    }

}
