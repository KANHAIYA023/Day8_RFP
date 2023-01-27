package Com.Day8_RFP;
import java.util.Scanner;
public class CompareToMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the len1 is : ");
        Integer len1 = sc.nextInt();

        System.out.print("enter the len2 is : ");
        Integer len2 = sc.nextInt();

        int compare = len1.compareTo(len2);

        if (compare==0){
            System.out.println(" len1 and len2 are equal");
        }
        else if (compare>0){
            System.out.println("len1 is greater than len2");
        }
        else{
            System.out.println("len1 is less than is len2");
        }
    }
}
