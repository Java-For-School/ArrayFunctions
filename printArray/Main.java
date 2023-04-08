public class Main {
  public static void main(String[] args) {
    int[] array = new int[10];

    for (int i = 0; i < 10; i++) {
      array[i] = i;
    }

    printArray(array, 10);
  }
  public static void printArray(int[] array, int size) { 
    System.out.print("[");
    for (int i = 0; i < size; i++) {
      System.out.print(array[i] + ",");
    }
    System.out.println("]");
  }
}
