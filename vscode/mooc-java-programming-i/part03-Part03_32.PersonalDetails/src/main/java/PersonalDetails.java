
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int total = 0;
        int counter = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) break;
            String [] splitted = input.split(",");
            if ( splitted[0].length() > longestName.length()) {
                longestName = splitted[0];
            }
           counter++; 
           total += Integer.valueOf(splitted[1]);
        }
        double average = (double) total/counter;
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
