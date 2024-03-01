public class Counter {
    private int value;

    public Counter(int initValue) {
        this.value = initValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void increase(int initIncrese) {
        if (initIncrese >= 0) this.value += initIncrese;
    }

    public void decrease() {
        this.value--;
    }

    public void decrease(int initDecrese) {
        if (initDecrese >= 0) this.value -= initDecrese;
    }
}
