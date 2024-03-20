import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> plates;

    public VehicleRegistry() {
        this.plates = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (plates.containsKey(licensePlate)) {
            return false;
        }
        plates.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return plates.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (plates.containsKey(licensePlate)) {
            plates.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate plate : plates.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String owner : plates.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }

    }
}
