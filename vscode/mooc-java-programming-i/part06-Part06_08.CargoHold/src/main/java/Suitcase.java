import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (totalWeight + item.getWeight() > this.maxWeight) {
            return;
        }
        suitcase.add(item);
        this.totalWeight += item.getWeight();
    }

    @Override
    public String toString() {
        if (suitcase.isEmpty()) {
            return "no items (0 kg)";
        }
        if (suitcase.size() == 1) {
            return suitcase.size() + " item (" + this.totalWeight + " kg)";
        }
        return suitcase.size() + " items (" + this.totalWeight + " kg)";

    }

    public void printItems() {
        for (Item item : suitcase) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
    }

    public int totalWeight() {
        return this.totalWeight;
    }

    public Item heaviestItem() {
        if (suitcase.isEmpty()) {
            return null;
        }
        Item heavy = suitcase.get(0);

        for (Item item : suitcase) {
            if (heavy.getWeight() < item.getWeight()) {
                heavy = item;
            }
        }

        return heavy;
    }
}