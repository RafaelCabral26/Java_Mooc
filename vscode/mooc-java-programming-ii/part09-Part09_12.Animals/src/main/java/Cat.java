public class Cat extends Animal implements NoiseCapable {
    
    public Cat() {
        super("Cat");
    }

    public Cat(String initName) {
        super(initName);
    }

    public void purr() {
        System.out.println(this.getName() + " purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
