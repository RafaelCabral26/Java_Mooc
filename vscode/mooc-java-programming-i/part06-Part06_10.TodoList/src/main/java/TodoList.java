import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList() {
        this.list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void print() {
        for (int i = 0; i < list.size() ; i++) {
            String getString = list.get(i);
            System.out.println((i + 1) + ": " + getString);
        }
    }

    public void remove(int number) {
        list.remove(number - 1);
    }
}
