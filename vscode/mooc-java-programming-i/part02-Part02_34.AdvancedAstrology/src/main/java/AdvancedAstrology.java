
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int counter = 1;
        while (counter <= number) {
            System.out.print("*");
            counter++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int counter = 1;
        while (counter <= number) {
            System.out.print(" ");
            counter++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int counter = 1;
        int fixedSize = size;
        while (counter <= fixedSize) {
            size--;
            printSpaces(size);
            printStars(counter);
            counter++;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int counter = 1;
        int counterHeight = height-1;
        while (counter <= height) {
            printSpaces(counterHeight);
            printStars(counter*2-1);
            counterHeight--;
            counter++;
        }
        printSpaces(height-2);
        printStars(3);
        printSpaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
