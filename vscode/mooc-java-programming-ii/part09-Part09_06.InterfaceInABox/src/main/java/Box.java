import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> myBox;

    public Box(double capacity) {
        this.maxWeight = capacity;
        this.myBox = new ArrayList<Packable>();
    }

    public void add(Packable item) {
       if (this.weight() + item.weight() > this.maxWeight) {
        return;
       } 
       myBox.add(item);
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item: myBox) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + myBox.size() + " items, total weight " + weight() + " kg";
    }
}
