public class Exercise {
    private String name;
    private boolean compleated;

    public Exercise(String name) {
        this.name = name;
        this.compleated = false;
    }

    public String getName() {
        return name;
    }

    public void setCompleated(boolean compleated) {
        this.compleated = compleated;
    }

    public boolean isCompleated() {
        return compleated;
    }
}
