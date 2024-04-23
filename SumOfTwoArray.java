import java.util.Scanner;

public class SumOfTwoArray {

  public static void main(String arg[]) {
    System.out.println("Enter array limit: ");
    Scanner s = new Scanner(System.in);
    int limit = s.nextInt();
    System.out.println("Enter value of first array: ");
    int a[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      a[i] = s.nextInt();
    }
    System.out.println("Enter value of second array: ");
    int b[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      b[i] = s.nextInt();
    }
    int sum[] = new int[limit];
    for (int i = 0; i < limit; i++) {
      sum[i] = a[i] + b[i];
    }
    System.out.println("Sum of two array: ");
    for (int i = 0; i < limit; i++) {
      System.out.println(sum[i]);
    }
  }
}
