public class Organism implements Movable {
    private int initX;
    private int initY;

    public Organism(int cordX, int cordY) {
        this.initX = cordX;
        this.initY = cordY;
    }

    public void move(int x, int y) {
        this.initX += x;
        this.initY += y;
    }

    @Override
    public String toString() {
        return "x: " + this.initX + "; y: " +  this.initY;
    }
}
