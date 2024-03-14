import java.util.ArrayList;
import java.util.Scanner;

public class RecipeList {
    private ArrayList<Recipe> recipeList;

    public RecipeList() {
        this.recipeList = new ArrayList<>();
    }

    public void buildList(Scanner unorderedList) {
        while (unorderedList.hasNextLine()) {
            String name = unorderedList.nextLine();
            int time = Integer.valueOf(unorderedList.nextLine());
            ArrayList<String> ingredients = new ArrayList<>();
            while (!unorderedList.nextLine().equals("") && unorderedList.hasNextLine()) {
                String newLine = unorderedList.nextLine();
                ingredients.add(newLine);
            }
            Recipe recipe = new Recipe(name, time, ingredients);
            recipeList.add(recipe);
        }
    }

    public void printList() {
        for (Recipe recipe : recipeList) {
            System.out.println(recipe);
        }
    }

}
