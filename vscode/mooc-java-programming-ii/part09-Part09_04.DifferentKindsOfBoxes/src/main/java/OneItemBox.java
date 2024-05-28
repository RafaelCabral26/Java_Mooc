import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> oneItem;

    public OneItemBox() {
        this.oneItem = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        if (oneItem.size() == 0) {
            oneItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        if (this.oneItem.contains(item)) {
            return true;
        }
        return false;
    }
}
