
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String returned = "The collection " + this.name + " has " + elements.size();
        if (elements.size() == 0) {
            returned = "The collection " + this.name + " is empty.";
        } else if (elements.size() == 1) {
            returned += " element:\n" + elements.get(0);
        } else {
            returned += " elements:\n";
            for (String element : elements) {
                returned += element + "\n";
            }
        }
        return returned;
    }

}
