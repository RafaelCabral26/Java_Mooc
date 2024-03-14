
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipeList = new RecipeList();
        System.out.println("File to read:");
        String file = scanner.nextLine();
        try {
            Scanner unorderedRecipeList = new Scanner(Paths.get(file));
            recipeList.buildList(unorderedRecipeList);
            while (true) {
                System.out.println("Commands:");
                System.out.println("list - lists the recipes");
                System.out.println("stop - stops the program");
                System.out.println();
                System.out.println("Enter command:");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }

                if (command.equals("list")) {
                    recipeList.printList();
                }
            }
        } catch (Exception e) {
            System.out.println("Meu ERRO" + e);
        }

    }

}
