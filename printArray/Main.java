public class Main {
  public static void main(String[] args) {
    int[] array = new int[10];

    for (int i = 0; i < 10; i++) {
      array[i] = i;
    }

    printArray(array);
  }
  public static void printArray(int[] array) { 
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + ",");
    }
    System.out.println("]");
  }
}
