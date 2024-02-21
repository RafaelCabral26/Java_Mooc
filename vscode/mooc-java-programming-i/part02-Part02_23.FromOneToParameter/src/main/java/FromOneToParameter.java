import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printUntilNumber(Integer.valueOf(scan.nextLine()));
        scan.close();
    }

    public static void printUntilNumber(int number) {
        int counter = 1;
        while (counter <= number) {
            System.out.println(counter);
            counter++;
        }

    }

}
