
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double counter = 0;
        int total = 0;
        while (true) {
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input > 0) {
                counter++;
                total += input;
            }
        }
        if (counter == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(total / counter);
        }
    }
}
