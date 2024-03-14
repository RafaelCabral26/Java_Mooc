import java.util.ArrayList;
import java.util.HashMap;

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
        HashMap<Integer, Integer> counter = new HashMap<>();
        counter.put(0, 0);
        counter.put(1, 0);
        counter.put(2, 0);
        counter.put(3, 0);
        counter.put(4, 0);
        counter.put(5, 0);
        for (Integer point : points) {
            if (point < 50) {
                counter.put(0, counter.get(0) + 1);
            } else if (point < 60) {
                counter.put(1, counter.get(1) + 1);
            } else if (point < 70) {
                counter.put(2, counter.get(2) + 1);
            } else if (point < 80) {
                counter.put(3, counter.get(3) + 1);
            } else if (point < 90) {
                counter.put(4, counter.get(4) + 1);
            } else if (point >= 90) {
                counter.put(5, counter.get(5) + 1);
            }

        }
        System.out.println("Counter get teste  " + counter.get(5));
        return "5: " + printStars(counter.get(5))+"\n"+
        "4: " + printStars(counter.get(4)) +"\n"+
        "3: " + printStars(counter.get(3))+ "\n"+
        "2: " + printStars(counter.get(2))+"\n"+
        "1: " + printStars(counter.get(1))+"\n"+
        "0: " + printStars(counter.get(0));
    }

    public String printStars(int number) {
        String stars = "";
        for (int i = 0; i < number; i++) {
            stars += "*";
        }
        return stars;
    }
}
