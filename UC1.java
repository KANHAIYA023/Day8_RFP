package Com.Day8_RFP;
import java.util.Random;
public class UC1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(2);
        if (x==1){
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
    }
}
