
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                System.out.println("Thx! Bye!");
                break;
            }
            sum += input;
            count++;
            if (input % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (1.0 * sum / count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
