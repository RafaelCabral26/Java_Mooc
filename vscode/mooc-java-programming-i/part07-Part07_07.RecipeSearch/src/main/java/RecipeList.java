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

            while (unorderedList.hasNextLine()) {
                String newLine = unorderedList.nextLine();
                if (newLine.equals("")) {
                    break;
                }
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

    public void findRecipe(String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList) {
            if (recipe.getName().equals(name)) {
                System.out.println(recipe);
            }
        }
    }

    public void findByTime(int time) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipeList) {
            if (recipe.getTime() <= time) {
                System.out.println(recipe);
            }
        }
    }

   public void searchByName(String name) {
    for (Recipe recipe : recipeList) {
        if (recipe.getName().contains(name)) {
            System.out.println(recipe);
        }
    }
   }

   public void findByIngredients(String ingredients) {
    for (Recipe recipe : recipeList) {
        if (recipe.getIngredients().contains(ingredients)) {
            System.out.println(recipe);
        }
    }
   } 

}
