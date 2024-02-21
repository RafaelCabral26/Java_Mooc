
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // implement finding the greatest number in the list here
        int temp = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            int listed = list.get(i);
            if (temp < listed) {
                temp = listed;
            }

        }
        System.out.println("The greatest number: " + temp);
    }
}
