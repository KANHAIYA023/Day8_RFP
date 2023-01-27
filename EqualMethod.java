package Com.Day8_RFP;
import java.util.Scanner;
public class EqualMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the length 1 is : ");
        Integer x = sc.nextInt();
        System.out.print("enter the length 2 is : ");
        Integer y = sc.nextInt();
        System.out.println(x.equals(y));
    }
}
