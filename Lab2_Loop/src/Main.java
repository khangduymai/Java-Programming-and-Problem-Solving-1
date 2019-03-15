import java.util.Random;
import java.util.Scanner;

public class Main {

    static final String MEDICINE_ONE = "Ciprofloxacin", MEDICINE_TWO = "Amoxicillin", MEDICINE_THREE = "Penicillin"
                    , MEDICINE_FOUR= "Cipro", MEDICINE_FIVE= "Vitamin E";

    static final int ROUND = 3;
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String arg[]){

        String userName, medicineName;
        int guessingNumber;
        boolean liveOrDie;

        userName = getString("Please enter your name");

        displayInstruction(userName);


        double totalHealth = 100;

        for(int i = 0; i < ROUND; i++){

            System.out.println();
            System.out.println("---- ROUND " + (i+1) + " ----");
            System.out.println();

            guessingNumber= getInteger("Hi " + userName + " Please enter your medicine");

            guessingNumber= validationNumber(guessingNumber,"Hi " + userName + " Please enter your medicine");

            medicineName = medicineChosen(guessingNumber);

            displayMedicineChosen(medicineName);

            System.out.println();

            liveOrDie = compareRandNum(guessingNumber,medicineName);

            System.out.println();
            System.out.println();

            if(liveOrDie){
                System.out.println("Your prescription beat the disease! Well done. \nThank you for saving the patient, Dr." + userName);
                break;
            }
            else{
                System.out.println("Your prescription did not affect the disease.");
                totalHealth = totalHealth - calHealthBaseOnRound(ROUND);
            }

            System.out.println("Your patient’s health is at " + totalHealth);

        }



    } // end main


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
        int randNum = getRandomNumber(1,5);
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

    public static double calHealthBaseOnRound(int round){

        return  100 / round;

    }

} // end class
