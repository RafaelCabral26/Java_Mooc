
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archList = new ArrayList<>();
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String input = scanner.nextLine();
            if (input.isEmpty()) break;
            System.out.println("Name? (empty will stop)");
            String input2 = scanner.nextLine();
            if (input2.isEmpty()) break;
            Archive newArch = new Archive(input, input2);
            if (archList.contains(newArch)) {
                continue;
            }
            archList.add(newArch);

        }
        for (Archive arch : archList) {
            System.out.println(arch);
        }
    }
}
