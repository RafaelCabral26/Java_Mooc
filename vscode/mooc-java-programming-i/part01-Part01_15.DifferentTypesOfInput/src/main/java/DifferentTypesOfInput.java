
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String text = scan.nextLine();
        System.out.println("Give an integer:");
        int inteiro = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double quebrado = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean vOuF = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + text);
        System.out.println("You gave the integer " + inteiro);
        System.out.println("You gave the double " + quebrado);
        System.out.println("You gave the boolean " + vOuF); 

    }
}