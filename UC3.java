package Com.Day8_RFP;
import java.util.Random;
public class UC3 {
    public static void main (String[]args){
        Random rd = new Random();
        int x = rd.nextInt(3);
        int perHourSalary = 20;
        if (x==1){
            int workingHour = 8;
            System.out.println("full time employee wage is : " + perHourSalary*workingHour);
        }
        else if (x==2){
            int workingHour = 4;
            System.out.println("part time employee wage is : " + perHourSalary*workingHour);
        }
        else{
            System.out.println("employee is absent");

        }
    }
}
