public class Container {
    private int container;

    public Container() {
        this.container = 0;
    }

    public void add(int number) {
        if (number < 0) {
            return;
        }
        this.container += number;
        if (this.container > 100) {
            this.container = 100;
        }
    }

    public void remove(int number) {
        if (number < 0) {
            return;
        }
        this.container -= number;
        if (this.container < 0) {
            this.container = 0;
        }
    }

    public String printContainer() {
        return this.container + "/100";
    }
    
    public int contains() {
        return this.container;
    }
    @Override
    public String toString() {
        return this.container + "/100";
    }
}
