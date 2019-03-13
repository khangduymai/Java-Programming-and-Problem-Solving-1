import java.util.Scanner;

public class Main {

    final static  int NUMBER = 1000;

    public static void main(String arg[]) {
/*        int numMale=0;
        int numFemale=0;*/


        dispplay(NUMBER);

        //int totalMalenFemale;
        //totalMalenFemale = numMale + numFemale;
        // double percentMale = (numMale/totalMalenFemale)*100;

/*
         int numberCheck = getInput();

         System.out.println(numberCheck);*/


/*        System.out.println("Enter # of males:");

        //Creating object named keyboad using Scanner Class
        Scanner male = new Scanner(System.in);

        //Creat string variable called name


        //input the name string to name variable
        numMale = male.nextInt();

        System.out.println("Here is your males: " + numMale);

        System.out.println("Enter # of famales:");

        //Creating object named keyboad using Scanner Class
        Scanner female = new Scanner(System.in);

        //Creat string variable called name

        //input the name string to name variable
        numFemale = male.nextInt();

        System.out.println("Here is your females: " + numFemale);


        totalMalenFemale = numMale + numFemale;

        //display result
        System.out.println(percentMale);*/

       /*double amountInput1;
        double amountInput2;*/

        String name;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        name = input.nextLine();
        System.out.println(name);
        /*System.out.println("Enter your second input");
        amountInput2 = input.nextDouble();

        double totalInput;
        double percentInput1, percentInput2;
        totalInput = amountInput1 + amountInput2;

        percentInput1 = (amountInput1 / totalInput) * 100;

        System.out.println("Percent input1: " + percentInput1);


        showDisplay(amountInput1, amountInput2);
*/
    }// END MAIN

/*    public static double getamoutPurchase(double purchaseAmout) {
        double amountInput;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your input");
        amountInput = input.nextDouble();

        //System.out.println(amountInput);
    }*/


    public static void showDisplay(double num1, double num2) {
        System.out.println("This is your first number " + num1 + "\n" + "This is your second number " + num2);
    }


    public static void  dispplay(int pokemon){
        System.out.println("This is your number: " + pokemon);
    }


}


/*    public static int getInput(){
        int number=0;

        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while(flag){
            System.out.println("Enter Number to valid");
            number = input.nextInt();
            if(number >= 0 && number < 2400)
                return number;

        }
        return number;*/







