package Com.Day8_RFP;
import java.util.Random;
public class UC4 {
    public static void main (String[]args){
        Random rd = new Random();
        int x = rd.nextInt(3);
        int perHourSalary = 20;
        switch(x){
            case 1:
                int workingHour = 8;
                System.out.println("full time employee wage is : " + perHourSalary*workingHour);
                break;
            case 2:
                int workingHour1 = 4;
                System.out.println("part time employee wage is : " + perHourSalary*workingHour1);
                break;
            case 0:
                System.out.println("employee is absent");
        }
    }
}
