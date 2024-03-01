public class Fitbyte {
   private int age;
   private int restHeartRate;
   
   public Fitbyte(int initAge, int initRestHeartRate) {
    this.age = initAge;
    this.restHeartRate = initRestHeartRate;
   }

   public double targetHeartRate(double percentage) {
        double maxHeartRate = 206.3 - (0.711 * this.age);
        return (maxHeartRate - this.restHeartRate) * percentage + this.restHeartRate;
   }

}
