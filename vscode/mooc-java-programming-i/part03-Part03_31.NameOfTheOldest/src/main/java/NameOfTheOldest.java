
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oldestName = "";
        int oldest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) break;
            String [] splitted = input.split(",");
            if (Integer.valueOf(splitted[1]) > oldest) {
                oldest = Integer.valueOf(splitted[1]);
                oldestName = splitted[0];
            } 
        }
        System.out.println("Name of the oldest: " + oldestName);
    }
}
