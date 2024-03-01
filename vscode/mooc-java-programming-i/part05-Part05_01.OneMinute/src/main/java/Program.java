public class Program {

    public static void main(String[] args) {
        // You can test your program here
        Timer timer = new Timer();
        int i = 0;
        while (i < 369425) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }

}
