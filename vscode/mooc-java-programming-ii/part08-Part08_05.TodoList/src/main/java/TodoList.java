import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> name;
    private boolean completed;    

    public TodoList(String name) {
        this.name = new ArrayList<>();
        this.completed = false;
    }

    public void compleatTask() {
        this.completed = true;
    }
}
