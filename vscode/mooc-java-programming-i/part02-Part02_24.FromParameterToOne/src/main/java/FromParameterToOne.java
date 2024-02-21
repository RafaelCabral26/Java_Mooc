import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        printFromNumberToOne(Integer.valueOf(scan.nextLine()));

    }

    public static void printFromNumberToOne(int number) {
        int counter = 1;
        while (number >= counter) {
            System.out.println(number);
            number--;
        }
    }
}
