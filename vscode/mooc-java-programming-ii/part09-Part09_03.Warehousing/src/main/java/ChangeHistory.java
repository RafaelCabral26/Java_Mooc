import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> amountChanges;

    public ChangeHistory() {
        this.amountChanges = new ArrayList<Double>();
    }

    public void add(double status) {
        amountChanges.add(status);
    }

    public void clear() {
        amountChanges.clear();
    }

    public double maxValue() {
        double currentValue = amountChanges.get(0);
        for (double value : amountChanges) {
            if (value > currentValue) {
                currentValue = value;
            }
        }
        return currentValue;
    }

    public double minValue() {
        double currentValue = amountChanges.get(0);
        for (double value : amountChanges) {
            if (value < currentValue) {
                currentValue = value;
            }
        }
        return currentValue;
    }

    public double average() {
        double sum = 0;
        if (amountChanges.size() == 0) {
            return sum;
        }

        for (double value : amountChanges) {
            sum += value;
        }

        return sum / amountChanges.size();

    }

    @Override
    public String toString() {
        return amountChanges.toString();
    }

}
