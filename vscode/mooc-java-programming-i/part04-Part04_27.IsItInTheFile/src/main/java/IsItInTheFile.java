
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try {
            Scanner findFile = new Scanner(Paths.get(file));
            while (findFile.hasNextLine()) {
                String currentLine = findFile.nextLine();
                System.out.println("current line " + currentLine + "searched for " + searchedFor);
                if (currentLine.equals(searchedFor)) {
                    System.out.println("Found!");
                    break;
                } else if (!findFile.hasNextLine()) {
                    System.out.println("Not found.");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
