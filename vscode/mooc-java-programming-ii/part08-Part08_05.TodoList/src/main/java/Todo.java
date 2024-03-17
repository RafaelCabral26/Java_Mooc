public class Todo {
    private String name;
    private boolean completed;

    public Todo(String name) {
        this.name = name;
        this.completed = false;
    }
    public void compleatTask() {
        this.completed = true;
    }
    @Override
    public String toString() {
        return this.name;
    }
}
