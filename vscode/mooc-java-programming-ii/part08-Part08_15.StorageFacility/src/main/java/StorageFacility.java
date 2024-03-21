import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (!storage.containsKey(storageUnit)) {
            return new ArrayList<>();
        }
        return storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        if (storage.get(storageUnit).contains(item)) {
            storage.get(storageUnit).remove(item);
        }
    }
    public ArrayList<String> storageUnits() {
        ArrayList<String> unitWithItems = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> unit : storage.entrySet()) {
           if (unit.getValue().size() > 0) {
            unitWithItems.add(unit.getKey());
           } 
        } 
        return unitWithItems;
    }
}
