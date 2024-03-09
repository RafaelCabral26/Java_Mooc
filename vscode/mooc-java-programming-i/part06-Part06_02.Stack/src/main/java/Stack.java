import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        if (values.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        values.add(value);
    }

    public ArrayList<String> values() {
        return this.values;
    }

    public String take() {
        String removed = values.get(values.size()-1);
        values.remove(values.size()-1);
        return removed;
    }
}
