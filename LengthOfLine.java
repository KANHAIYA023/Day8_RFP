package Com.Day8_RFP;
import java.util.Scanner;

public class LengthOfLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the x1 is: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the x2 is: ");
        int x2 = sc.nextInt();

        System.out.print("Enter the y1 is: ");
        int y1 = sc.nextInt();
        System.out.print("Enter the y2 is: ");
        int y2 = sc.nextInt();

        int a = x2 - x1;
        int b = y2 - y1;
        double len = Math.sqrt(a*a + b*b);
        System.out.println("length of line is: " + len);
    }
}
