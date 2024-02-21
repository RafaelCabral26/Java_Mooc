
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());
        int print = 0;
        int counter = 0;
        while (counter != input) {
            counter++;
            print += counter;
        }
        System.out.println(print);
    }
}
