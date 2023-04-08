public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        int element = 45;
        System.out.printf("The index of the element: %d is: %d\n", element, binarySearch(array, element));
    }
    private static int binarySearch(int[] array, int element) {
        int left = 0, right = array.length - 1;

        while (left < right) {
            if (array[left] == element) return left;
            if (array[right] == element) return right;

            int middle = (int) (left + right) / 2;

            if (array[middle] == element) return middle;
            if (array[middle] < element) left = middle + 1;
            if (array[middle] > element) right = middle - 1;
        }

        return -1;
    }
}