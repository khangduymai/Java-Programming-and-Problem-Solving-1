import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    static final String MEDICINE_ONE = "Ciprofloxacin", MEDICINE_TWO = "Amoxicillin", MEDICINE_THREE = "Penicillin"
                    , MEDICINE_FOUR= "Cipro", MEDICINE_FIVE= "Vitamin E";

    static final int ROUND = 6;
    static final double HEALTH = 99.0;
    static Scanner keyboard = new Scanner(System.in);



    public static void main(String args[]){

        String userName;

        userName = getString("Please enter your name");

        displayInstruction(userName);

        double newTotalHealth = calNewHealthBaseOnRound(ROUND);

        playGame(userName, newTotalHealth);


    } // end main

/*-------------------------------------------------------------------------------------------------------------- */
    public static int getInteger(String msg) {
        System.out.println(msg);
        while (!keyboard.hasNextInt()) {
            keyboard.nextLine();
            System.err.println("Invalid integer. Try again.");
            System.out.println(msg);
        }
        int number = keyboard.nextInt();
        keyboard.nextLine(); //flushes the buffer
        return number;
    } // end getInteger

    public static int getRandomNumber (int low, int high) {
        return (int)(Math.random() * ((high + 1) - low)) + low;

    } // end getRandomNumber

    public static String getString(String msg) {
        String answer = "";
        System.out.println(msg);
        try {
            answer = keyboard.nextLine();
        }
        catch (Exception e) {
            System.err.println("Error reading input from user. Ending program.");
            System.exit(-1);
        }

        while (answer.replace(" ", "").equals("")) {
            System.err.println("Error: Missing input.");
            try {
                System.out.println(msg);
                answer = keyboard.nextLine();
            }
            catch (Exception e) {
                System.err.println("Error reading input from user. Ending program.");
                System.exit(-1);
            }
        }
        return answer;
    } // end getString


    public static int validationNumber(int number, String msg){
        while( number < 1 || number > 5){
            System.err.println("Error, please enter your medicine and it should be from 1 to 5 only");
            //System.out.println(msg);

            number = getInteger(msg);

            /*while(!keyboard.hasNextInt()){
                keyboard.nextLine();
                System.err.println("Invalid integer. Try again.");
                keyboard.nextLine();
                System.out.println(msg);
            }
            number = keyboard.nextInt();*/

        }

        return number;
    } //end validation


    public static void displayInstruction(String name){
        System.out.println("We have several medicines to try to defeat the disease, Dr." + name +"\n"
            + "We will identify them by number: \n"
                + "\t1. " + MEDICINE_ONE + "\n"
                + "\t2. " + MEDICINE_TWO + "\n"
                + "\t3. " + MEDICINE_THREE + "\n"
                + "\t4. " + MEDICINE_FOUR + "\n"
                + "\t5. " + MEDICINE_FIVE + "\n"
        );
    } // end displayInstruction

    public static void displayMedicineChosen(String nameMedicine){
        System.out.println(nameMedicine + ". Good choice.");
    } //end displayMedicineChosen

    public static String medicineChosen(int num){
        switch (num){
            case 1:
                return MEDICINE_ONE;

            case 2:
                return MEDICINE_TWO;

            case 3:
                return MEDICINE_THREE;

            case 4:
                return MEDICINE_FOUR;

            default:
                return MEDICINE_FIVE;
        }

    }

    public static boolean compareRandNum(int medicine, String medicineName ){
        int randNum = getRandomNumber(6,8);
        System.out.println("It is time the patient take the medicine");
        if(randNum == medicine){
            System.out.println("The disease IS  vulnerable to " + medicineName +"!");
            return true;
        }
        else{
            System.out.println("The disease is not vulnerable to " + medicineName +"!");
            return false;
        }

    } // end boolean compareRandNum


    

    public static double calNewHealthBaseOnRound(int round){

        return Math.floor(HEALTH / round) * round;

    }

    public static boolean displayResult(boolean liveOrDie, String userName){
        if(liveOrDie){
            System.out.println("Your prescription beat the disease! Well done. \nThank you for saving the patient, Dr." + userName);
            return true;
        }
        else{
            System.out.println("Your prescription did not affect the disease.");
            return false;
        }
    }

    public static double healthDecreasing(boolean liveOrDie, double newTotalHealth){
        if(liveOrDie == false){
          return   Math.floor(HEALTH/ROUND);
        }

        return newTotalHealth;
    }

    public static void displayHealthDecreasing(boolean liveOrDie, double newTotalHealth){
        if(liveOrDie==false)
            System.out.println("Your patient’s health is at " + (newTotalHealth));
    }


    public static void playGame(String userName, double newTotalHealth){

        int guessingNumber;
        String medicineName;
        boolean liveOrDie = false;


        for(int i = 0; i < ROUND && liveOrDie != true; i++){

            System.out.println();
            System.out.println("---- ROUND " + (i+1) + " ----");
            System.out.println();

            guessingNumber= getInteger("Hi " + userName + " Please enter your medicine");

            guessingNumber= validationNumber(guessingNumber,"Hi " + userName + " Please enter your medicine");

            medicineName = medicineChosen(guessingNumber);

            displayMedicineChosen(medicineName);

            System.out.println();

            liveOrDie = compareRandNum(guessingNumber,medicineName); //false

            System.out.println();
            System.out.println();

           /* if(liveOrDie){
                System.out.println("Your prescription beat the disease! Well done. \nThank you for saving the patient, Dr." + userName);
                break;
            }
            else{
                System.out.println("Your prescription did not affect the disease.");
                newTotalHealth -= Math.floor(100.0/ROUND);
            }

            System.out.println("Your patient’s health is at " + (newTotalHealth));*/

            liveOrDie= displayResult(liveOrDie, userName); //false
            newTotalHealth -= healthDecreasing(liveOrDie, newTotalHealth);
            displayHealthDecreasing(liveOrDie,newTotalHealth);

        }
    }



} // end class
