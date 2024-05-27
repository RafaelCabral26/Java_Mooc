import java.util.ArrayList;

public class Person {
    private String name;
    private String address;

    public Person(String newName, String newAddress) {
        this.name = newName;
        this.address = newAddress;
    }

    @Override
    public String toString() {
        return this.name + "\n  " + this.address;
    }

}
