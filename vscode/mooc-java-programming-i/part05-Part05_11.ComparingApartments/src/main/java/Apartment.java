
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment apar) {
        if (this.squares > apar.getSquares()) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int thisAp = this.squares * this.princePerSquare;
        int compAp = compared.getSquares() * compared.getPrincePerSquare();
        return Math.abs(thisAp - compAp);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisAp = this.squares * this.princePerSquare;
        int compAp = compared.getSquares() * compared.getPrincePerSquare();
        if (thisAp > compAp) {
            return true;
        }
        return false;
    }

    public int getSquares() {
        return this.squares;
    }

    public int getPrincePerSquare() {
        return this.princePerSquare;
    }

}
