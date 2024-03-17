import java.util.ArrayList;

public class TodoList {
    private ArrayList<Todo> todoList;

    public TodoList() {
        this.todoList = new ArrayList<>();
    }

    public void add(String name) {
        Todo newTodo = new Todo(name);
        todoList.add(newTodo);
    }

    public void print() {
        int index = 1;
        for (Todo todo : todoList) {
            System.out.println(index + ": " + todo);
            index++;
        }
    }

    public void remove(int index) {
        todoList.remove(index - 1);
    }

    public void compleat(int index) {
        todoList.get(index).compleatTask();
    }
}
