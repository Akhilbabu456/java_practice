import java.util.Scanner;

public class sum {

  public static void main(String ar[]) {
    System.out.println("Enter two numbers:");
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = a + b;
    System.out.println("result: " + c);
  }
}
