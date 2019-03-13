import java.util.*;

public class Main {

    private static final int ARRAY_SZIE = 4;

    public static void main(String arg[]){



        String[] employeeName = new String[ARRAY_SZIE];

        Scanner input = new Scanner(System.in);

        System.out.println("Please type first employee name");
        employeeName[0] = input.nextLine();

        System.out.println("Please type second employee name");
        employeeName[1] = input.nextLine();

        System.out.println("Please type third employee name");
        employeeName[2] = input.nextLine();

        //Display employee name
        display(employeeName);

    }

    public static void display(String[] name){
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
