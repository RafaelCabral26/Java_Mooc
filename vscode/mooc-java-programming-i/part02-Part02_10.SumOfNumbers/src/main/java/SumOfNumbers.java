
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            counter += input;
            if (input == 0) {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + counter);

    }
}
