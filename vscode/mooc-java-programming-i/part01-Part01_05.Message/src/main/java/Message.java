
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        // Write your program here
        System.out.println("Write a message: ");
        System.out.println(line);
        scanner.close();
    }
}
