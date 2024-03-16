import java.util.ArrayList;

public class ContainerManager {
    private ArrayList<Container> containers;

    public ContainerManager() {
        this.containers = new ArrayList<>();
        Container first = new Container();
        Container second = new Container();
        containers.add(first);
        containers.add(second);
    }

    public void addLiquid(int number) {
        containers.get(0).add(number);
    }

    public void removeLiquid(int number) {
        containers.get(1).remove(number);
    }

    public void move(int number) {
        if (number < 0) {
            return;
        }
        int first = containers.get(0).contains();
        int second = containers.get(1).contains();
        if (first < number) {
           containers.get(1).add(containers.get(0).contains()); 
           containers.get(0).remove(number);
        } else {
            containers.get(0).remove(number);
            containers.get(1).add(number);
        }
    }

    @Override
    public String toString() {
        return "First: " + containers.get(0) + "\nSecond:" + containers.get(1) + "\n";
    }
}
