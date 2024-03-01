public class Cube {
    private int edgeLength;

    public Cube(int initEdge) {
        this.edgeLength = initEdge;
    }

    public int volume() {
        return (int) Math.pow(this.edgeLength,3);
    }

    public String toString() {
        return "The length of the edge is " + this.edgeLength +  " and the volume " + volume();
    }
}
