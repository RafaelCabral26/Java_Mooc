import java.util.ArrayList;

public class MisplacingBox extends Box {
    private ArrayList<Item> missBox;

    public MisplacingBox() {
        this.missBox = new ArrayList<Item>();
    }

    @Override
    public void add(Item item) {
        missBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
}
