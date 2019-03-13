import java.awt.desktop.SystemEventListener;
import java.util.*;

public class CalculatePayRate {

    private static final int HOURS_SIZE = 3;
    private static double payRate;

    public static void  main(String arg[]){
        Scanner input = new Scanner(System.in);

        double[] workingHours = new double[HOURS_SIZE];


        System.out.println("Please total hours working of employees number 1");
        workingHours[0] = input.nextDouble();

        System.out.println("Please total hours working of employees number 2");
        workingHours[1] = input.nextDouble();

        System.out.println("Please total hours working of employees number 3");
        workingHours[2] = input.nextDouble();

        //displayHours(workingHours);

        System.out.println("Please enter pay rate:");
        payRate = input.nextDouble();

        displayAmount(workingHours);


    }

    private static void displayHours(double[] hours){
        for(int i = 0; i < hours.length; i++){
            System.out.println("Employee number " + (i+1) + " works for " + hours[i]);
        }
    }

    private static void displayAmount(double[] hoursWorking){
        for(int i = 0; i < hoursWorking.length; i++){
            System.out.println("Employee number " + (i+1) + " works for " + hoursWorking[i]);
            double grossPay;
            grossPay = hoursWorking[i] * payRate;
            System.out.println("Employee number " + (i+1) + " gets paid for $ " + grossPay);
        }
    }

}
