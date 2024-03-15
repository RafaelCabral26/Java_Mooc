import java.util.ArrayList;

public class BirdManagement {
    private ArrayList<Bird> manager;

    public BirdManagement() {
        this.manager = new ArrayList<>();
    }

    public void addBird(String name, String latinName) {
        Bird newBird = new Bird(name, latinName);
        manager.add(newBird);
    }

    public void addObservation(String name) {
        boolean check = false;
        for (Bird bird : manager) {
            if (bird.getName().contains(name)) {
                check = false;
                bird.addObservations();
            }
            if (!check) {
                System.out.println("Not a bird!");
            }
        }
    }

    public void printAll() {
        for (Bird bird : manager) {
            System.out.println(bird);
        }
    }

    public void printBird(String name) {
        for (Bird bird : manager) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }

}
