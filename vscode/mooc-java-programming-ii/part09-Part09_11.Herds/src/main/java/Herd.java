import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable newSheep) {
        herd.add(newSheep);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable sheep : herd) {
            sheep.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String stringifyList = "";
        for (Movable sheep : herd) {
            stringifyList += (sheep.toString() + "\n");
        }
        return stringifyList;
    }
}
