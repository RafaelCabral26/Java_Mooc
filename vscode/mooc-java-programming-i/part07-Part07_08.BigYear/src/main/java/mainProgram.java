
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdManagement manager = new BirdManagement();
        Scanner scan = new Scanner(System.in);
        System.out.println("?");

        while (true) {
            String command = scan.nextLine();

            if (command.equals("Quit")) {
                break;
            }
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                manager.addBird(name, latinName);
            }

            if (command.equals("Observation")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                manager.addObservation(bird);
            }

            if (command.equals("All")) {
                manager.printAll();
            }

            if(command.equals("One")) {
                System.out.println("Bird?");
                String bird = scan.nextLine();
                manager.printBird(bird);
            }
        }
    }

}
