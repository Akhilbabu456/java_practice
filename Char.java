import java.util.Scanner;

public class Char {

  public static void main(String a[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a character");
    char ch = sc.next().charAt(0);
    System.out.println("The character is " + ch);
  }
}
