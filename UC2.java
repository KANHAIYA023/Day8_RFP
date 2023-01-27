package Com.Day8_RFP;
import java.util.Random;
public class UC2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int x = rd.nextInt(2);
        int perHourSalary = 20;
        if(x==1){
            int workingHour = 8;
            System.out.println("Full time Employee wage : " + perHourSalary*workingHour);
        }
        else {
            System.out.println("employee is not present");
        }
    }
}
