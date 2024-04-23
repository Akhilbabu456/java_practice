import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args){
        System.out.println("Enter a character:");
        Scanner s = new Scanner(System.in);
        char value = s.next().charAt(0);
        int ascii = (int)value;
        System.out.println("The ASCII value of "+value+" is "+ascii);
    }
}
