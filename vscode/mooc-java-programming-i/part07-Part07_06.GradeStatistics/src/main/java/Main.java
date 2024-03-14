
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Points points = new Points();
        // Write your program here -- consider breaking the program into
        // multiple classes.
        while (true) {
            System.out.println("Enter point totals, -1 stops:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }
            points.add(number);
        }
        
         System.out.println("Point average (all): " + points.average());
         System.out.println("Point average (passing): " + points.averagePassing());
         System.out.println("Pass percentage: " + points.passPercentage());
         System.out.print(points.gradeDistribution());
    }
}
