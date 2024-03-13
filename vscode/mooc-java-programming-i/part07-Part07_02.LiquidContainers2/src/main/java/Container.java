public class Container {
    private int amount;

    public Container() {
        this.amount = 0;
    }

    public int contains() {
        return this.amount;
    }

    public void add(int number) {
        if (number < 0) {
            return;
        }

        if (number + this.amount > 100) {
            this.amount = 100;
            return;
        }
        this.amount += number;
    }

    public void remove(int number) {
        if (number < 0) {
            return;
        }

        if (this.amount - number < 0) {
            this.amount = 0;
            return;
        }

        this.amount -= number;
    }

    @Override
    public String toString() {
        return this.amount + "/100";
    }
}
