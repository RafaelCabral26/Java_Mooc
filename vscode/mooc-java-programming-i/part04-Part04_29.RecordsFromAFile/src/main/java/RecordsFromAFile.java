
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try {
            Scanner searchedFile = new Scanner(Paths.get(file));
            while (searchedFile.hasNextLine()) {
                String[] line = searchedFile.nextLine().split(",");
                System.out.println(line[0] + ", age: " + Integer.valueOf(line[1]) + " years");
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
