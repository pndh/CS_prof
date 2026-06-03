public class Example {
  public static void main(String[] unused) {
    int[] array = {1, 2, 3, 4, 5};
    int size = array.length;
    int sum = 0;
    for (int i = 0; i < size; i++){
      sum += array[i];
    }
    System.out.println(sum);
  }
}