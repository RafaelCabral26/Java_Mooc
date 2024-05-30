public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int initAmount) {
        this.tacos = initAmount;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (this.tacos > 0) {
            tacos--;
        }
    }

}
