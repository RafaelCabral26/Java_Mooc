import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        room.add(person);
    }

    public boolean isEmpty() {
        if (room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if (room.isEmpty()) {
            return null;
        }
        Person shortPerson = room.get(0);
        for (Person person : room) {
            if (shortPerson.getHeight() > person.getHeight()) {
                shortPerson = person;
            }
        }
        return shortPerson;
    }

    public Person take() {
        if (room.isEmpty()) {
            return null;
        }
        Person shortest = room.get(0);
        int shortIndex = 0;
        for (int i = 0; i < room.size(); i++) {
            if (shortest.getHeight() > room.get(i).getHeight()) {
                shortest = room.get(i);
                shortIndex = i;
            }
        }
        room.remove(shortIndex);
        return shortest;
    }
}
