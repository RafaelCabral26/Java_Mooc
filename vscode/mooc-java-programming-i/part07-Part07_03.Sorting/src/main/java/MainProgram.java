
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = { 3, 1, 5, 99, 3, 12 };
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int indexSmall = 0;
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexSmall = i;
            }
        }
        return indexSmall;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int indexSmall = startIndex;
        int smallest = array[startIndex];
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexSmall = i;
            }
        }
        return indexSmall;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int smallestIndex;
        for (int i = 0; i < array.length - 1; i++) {
            smallestIndex = indexOfSmallestFrom(array,i);
            swap(array, i, smallestIndex);
        }
    }

}
