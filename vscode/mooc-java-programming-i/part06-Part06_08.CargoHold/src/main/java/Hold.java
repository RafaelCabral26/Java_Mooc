import java.util.ArrayList;

public class Hold {
    private int maxW;
    private ArrayList<Suitcase> holder;
    private int totalW;
    public Hold(int maxW) {
        this.maxW = maxW;
        this.holder = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalW + suitcase.totalWeight() > this.maxW) {
            return;
        }

        holder.add(suitcase);
        totalW += suitcase.totalWeight();
    }
    
    @Override
    public String toString() {
        return holder.size() + " suitcases (" + this.totalW + " kg)"; 
    }

    public void printItems() {
        for (Suitcase suitcase : holder) {
            suitcase.printItems();
        }
    }
}
