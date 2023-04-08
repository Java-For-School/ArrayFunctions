public class Main {
    public static void main(String[] args) {
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.ceil(100 * Math.random());
        }
        printArray(bubbleSort(array));
    }
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d, ", array[i]);
        }
        System.out.println("");
    }
}