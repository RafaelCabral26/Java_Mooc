
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals(""))
                break;
            String[] splited = input.split(" ");
            for (String e : splited) {
                if (e.contains("av")) {
                    System.out.println(e);
                }
            }
        }

    }
}
