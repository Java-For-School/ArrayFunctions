public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        int element = 45;
        System.out.printf("The index of the element: %d is: %d\n", element, findElement(array, element));
    }    

    private static int findElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return i;
        }
        return -1;
    }
}
