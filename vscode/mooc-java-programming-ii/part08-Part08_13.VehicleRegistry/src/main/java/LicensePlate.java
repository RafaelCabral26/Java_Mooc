
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

@Override
public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof LicensePlate)) {
            return false;
        }
        
        LicensePlate plate = (LicensePlate) obj;

        if (plate.liNumber.equals(this.liNumber) &&
                plate.country.equals(this.country)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (liNumber + country).hashCode();
    }
}
    
