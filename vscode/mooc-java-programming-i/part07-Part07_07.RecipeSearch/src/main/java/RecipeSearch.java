
import java.nio.file.Paths;
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
                System.out.println("find name - searches recipes by name");
                System.out.println("find cooking time - searches recipes by cooking time");
                System.out.println("find ingredient - searches recipes by ingredient");
                System.out.println();
                System.out.println("Enter command:");
                String command = scanner.nextLine();
                if (command.equals("stop")) {
                    break;
                }

                if (command.equals("list")) {
                    recipeList.printList();
                }

                if (command.equals("find name")) {
                    System.out.println("Searched word:");
                    String word = scanner.nextLine();
                    recipeList.searchByName(word);
                }

                if (command.equals("find cooking time")) {
                    int time = Integer.valueOf(scanner.nextLine());
                    recipeList.findByTime(time);
                }

                if (command.equals("find ingredient")) {
                    System.out.println("Ingredient:");
                    String ingredient = scanner.nextLine();
                    recipeList.findByIngredients(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Meu ERRO" + e);
        }

    }

}
