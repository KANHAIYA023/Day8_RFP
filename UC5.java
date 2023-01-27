package Com.Day8_RFP;
import java.util.Random;
import java.util.Scanner;
public class UC5 {
    public static void main(String[]args){
        Random rd = new Random();
        int x = rd.nextInt(3);
        int perHourSalary = 20;

        for (int day=1; day<=20; day++){
            if(x==1){
                int workingHour=8;
                System.out.println(day + "days full time employee wage is " + day * perHourSalary * workingHour);
                if (day==5){
                    break;
                }
            }
            else if (x==2){
                int  workingHour=4;
                System.out.println(day + "days part time employee wage is " + day * perHourSalary * workingHour);
                if (day==5){
                    break;
                }
            }
            else {
                System.out.println("employee is absent");
                if (day == 1) {
                    break;
                }

            }
        }

    }
}
