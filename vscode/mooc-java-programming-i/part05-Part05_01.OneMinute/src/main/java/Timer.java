public class Timer {

    private ClockHand seconds;
    private ClockHand hundreth;

    public Timer() {
        this.seconds = new ClockHand(100);
        this.hundreth = new ClockHand(100);

    }

    public void advance() {
        this.seconds.advance();

        if (this.seconds.value() == 0) {
            this.hundreth.advance();
        }
    }

    public String toString() {
        return hundreth + ":" + seconds;
    }
}
