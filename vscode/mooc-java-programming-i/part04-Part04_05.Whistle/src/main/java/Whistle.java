public class Whistle {
    private String noise;

    public Whistle(String noise) {
        this.noise = noise;
    }

    public void sound() {
        System.out.println(this.noise);
    }
}
