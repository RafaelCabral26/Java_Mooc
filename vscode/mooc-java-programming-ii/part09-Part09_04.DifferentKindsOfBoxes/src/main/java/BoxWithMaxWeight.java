import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> boxWeighted;

    public BoxWithMaxWeight(int maxWeight) {
        this.capacity = maxWeight;
        this.boxWeighted = new ArrayList<Item>();
    }

    @Override
    public void add(Item newItem) {
        if (this.capacity - newItem.getWeight() < 0) {
            return;
        }
        this.capacity -= newItem.getWeight();
        this.boxWeighted.add(newItem);

    }

    public boolean isInBox(Item items) {
        if (this.boxWeighted.contains(items)) {
            return true;
        }
        return false;
    }
}
