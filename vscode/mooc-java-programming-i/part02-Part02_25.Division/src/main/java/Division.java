import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        division(Integer.valueOf(scan.nextLine()), Integer.valueOf(scan.nextLine()));
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        // division(3, 5);
    }

    public static void division(int first, int second) {
        double result = (double) first / second;
        System.out.println(result);
    }
    // implement the method here
}
