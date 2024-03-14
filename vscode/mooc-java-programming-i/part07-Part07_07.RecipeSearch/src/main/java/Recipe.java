import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time, ArrayList<String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return name + ", " + "cooking time: " + time;
    }
}
