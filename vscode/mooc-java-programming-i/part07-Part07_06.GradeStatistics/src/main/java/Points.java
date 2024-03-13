import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> points;

    public Points() {
        this.points = new ArrayList<>();
    }

    public void add(int point) {
        if (point < 0 || point > 100) {
            return;
        }
        points.add(point);
    }

    public double average() {
        int sum = 0;
        for (Integer point : points) {
            sum += point;
        }
        return sum / points.size();
    }

    public double averagePassing() {
        int sum = 0;
        int counterPassingPoints = 0;
        for (Integer point : points) {
            if (point >= 50) {
                sum += point;
                counterPassingPoints++;
            }
        }
        return sum / counterPassingPoints;

    }

    public double passPercentage() {
        int counterPassingPoints = 0;
        for (Integer point : points) {
            if (point >= 50) {
                counterPassingPoints++;
            }
        }
        return (double) (100 * counterPassingPoints) / points.size();

    }

    public String gradeDistribution() {
        System.out.println("Grade distribution:");
    }
}
