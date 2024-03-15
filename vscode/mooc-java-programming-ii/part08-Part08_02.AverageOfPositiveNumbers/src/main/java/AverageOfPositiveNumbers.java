
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input > 0) {
                numbers.add(input);
            }
            if (input == 0) {
                break;
            }
        }
        int sum = 0;
        for (Integer num : numbers) {
            sum += num;
        }
        if (sum > 0) {
            System.out.println((double) sum / numbers.size());
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
