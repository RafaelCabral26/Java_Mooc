import java.util.ArrayList;

public class Container {
    private int[] container = new int[2];

    public Container() {
        this.container = new int[]{0,0};
    }

    public void add(int number) {
        if (number < 0) {
            return;
        }

        int first = this.container[0];
        if (first + number > 100) {
            first = 100;
        } else {
            first += number;
        }

        this.container[0] = first;
    }

    public void move(int number) {
        if (container[0] < number) {
            container[1] += container[0];
            container[0] -= number;
        } else {
            container[0] -= number;
            container[1] += number;
        }

        if (container[0] < 0 ) {
            container[0] = 0;
        }
        
        if (container[1] > 100) {
           container[1] = 100; 
        }
    }

    public void remove(int number) {
        container[1] -= number;
        if (container[1] < 0 ) {
            container[1] = 0;
        }
    }
    @Override
    public String toString() {
        return "First: " + this.container[0] + "/100\nSecond: " + this.container[1] + "/100\n";
    }
}
