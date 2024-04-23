import java.util.Scanner;

public class multiply {

  public static void main(String ar[]) {
    Scanner s = new Scanner(System.in);

    System.out.println("Enter two number: ");
    int a = s.nextInt();

    int b = s.nextInt();

    int c = a * b;

    System.out.println("The product of the two numbers is: " + c);
  }
}
