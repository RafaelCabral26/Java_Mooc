
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            numbers.add(input); 
            if (input == 9999) break;
            
        }
        int smallest = numbers.get(0);
        int index = 0;
        for ( int i = 0; i < numbers.size();i++) {
           int currentNumber = numbers.get(i);
           if (smallest > currentNumber ) {
            smallest = currentNumber;
            index = i;
           } 
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Found at index: " + index); 
    }
}
