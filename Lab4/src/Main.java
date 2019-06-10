import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);

    public static final int SING_IN_DOCOR = 1, DISPLAY_HISTORY = 2, PRESCRIBE_MEDICINE = 3, RESET = 4, EXIT = 5;

    public static final String MEDICINE_NUM_ONE = "Abilify", MEDICINE_NUM_TWO = "Ambien", MEDICINE_NUM_THREE = "Amoxi",
            MEDICINE_NUM_FOUR = "Aspirin", MEDICINE_NUM_FIVE = "Crestor", MEDICINE_NUM_SIX = "PlaceboTec",
            MEDICINE_NUM_SEVEN = "Xanax", MEDICINE_NUM_EIGHT = "Norvasc", MEDICINE_NUM_NINE = "Penicillin",
            MEDICINE_NUM_TEN = "Plavix", MEDICINE_NUM_ELEVEN = "Prilosec", MEDICINE_NUM_TWELVE = "Wellbe",
            MEDICINE_NUM_THIRTEEN = "Nexim", MEDICINE_NUM_FOURTEEN = "Zoloft";
    public static final String MEDICINE_ONE_DESC = "an antipsychotic drug", MEDICINE_TWO_DESC = "to treat insomnia",
            MEDICINE_THREE_DESC = "an antibiotic", MEDICINE_FOUR_DESC = "a pain reliever",
            MEDICINE_FIVE_DESC = "a cholesterol-lowering statin drug", MEDICINE_SIX_DESC = "to treat hypochondriacs",
            MEDICINE_SEVEN_DESC = "to treat anxiety disorders", MEDICINE_EIGHT_DESC = "a high blood pressure drug",
            MEDICINE_NINE_DESC = "an antibiotic", MEDICINE_TEN_DESC = "a blood thinner",
            MEDICINE_ELEVEN_DESC = "to treat reflux disease", MEDICINE_TWELVE_DESC = "an antidepressant",
            MEDICINE_THIRTEEN_DESC = "an antacid drug", MEDICINE_FOURTEEN_DESC = "an antidepressant";

    public static final int MAX_BOOLEAN_SIZE = 14, SENTINAL_BOOLEAN = 0, ROWS_SIZE = 14, COLS_SIZE = 2,
            MIN_OPTION = 1, MAX_OPTION = 5;


    public static final String[][] MEDICINE = {{MEDICINE_NUM_ONE + "\t\t\t", MEDICINE_ONE_DESC}, {MEDICINE_NUM_TWO + "\t\t\t", MEDICINE_TWO_DESC},
            {MEDICINE_NUM_THREE + "\t\t\t", MEDICINE_THREE_DESC}, {MEDICINE_NUM_FOUR + "\t\t\t", MEDICINE_FOUR_DESC}, {MEDICINE_NUM_FIVE + "\t\t\t", MEDICINE_FIVE_DESC},
            {MEDICINE_NUM_SIX + "\t\t", MEDICINE_SIX_DESC}, {MEDICINE_NUM_SEVEN + "\t\t\t", MEDICINE_SEVEN_DESC}, {MEDICINE_NUM_EIGHT + "\t\t\t", MEDICINE_EIGHT_DESC},
            {MEDICINE_NUM_NINE + "\t\t", MEDICINE_NINE_DESC}, {MEDICINE_NUM_TEN + "\t\t\t", MEDICINE_TEN_DESC}, {MEDICINE_NUM_ELEVEN + "\t\t", MEDICINE_ELEVEN_DESC},
            {MEDICINE_NUM_TWELVE + "\t\t\t", MEDICINE_TWELVE_DESC}, {MEDICINE_NUM_THIRTEEN + "\t\t\t", MEDICINE_THIRTEEN_DESC}, {MEDICINE_NUM_FOURTEEN + "\t\t\t", MEDICINE_FOURTEEN_DESC}
    };

    public static final boolean[] MEDICINE_PRESCRIBED = new boolean[MAX_BOOLEAN_SIZE];

    public static void main(String[] args) {


        String drName = "",
                msgOption = "Please enter a menu option:",
                msgDrName = "What is your name, doctor?",
                msgNoNameWarning = "Invalid entry. You must sign in first doctor.";

        int optionNumber;


        do {

            if (drName.equals("")) {
                displayMenuGame();
            } else {
                displayMenuWithDrName(drName);
            }

            System.out.println();

            optionNumber = getInteger(msgOption);

            optionNumber = checkOptionMenuRange(optionNumber, msgOption);


            drName = processingSubscribed(optionNumber, drName, msgDrName, msgNoNameWarning);



        } while (optionNumber != EXIT);


    } // end main

    //List of voids
    public static void displayMenuGame() {
        System.out.print("*********************************************\n");
        System.out.print("Welcome to your Animal’s Prescription History\n");
        System.out.print("*********************************************\n\n");
        System.out.print("Menu Options:\n\n" +
                "1. Sign in as the Animal’s doctor\n" +
                "2. Display the Animal’s Prescription History\n" +
                "3. Prescribe Medicine\n" +
                "4. Reset Animal’s Prescription History\n" +
                "5. Exit the program\n");
    } //end displayMenuGame

    public static void displayMenuWithDrName(String name) {
        System.out.print("*********************************************\n");
        System.out.print("Welcome to your Animal’s Prescription History\n");
        System.out.print("*********************************************\n\n");
        System.out.print("Menu Options for Dr." + name + "\n\n" +
                "1. Sign in as the Animal’s doctor\n" +
                "2. Display the Animal’s Prescription History\n" +
                "3. Prescribe Medicine\n" +
                "4. Reset Animal’s Prescription History\n" +
                "5. Exit the program\n");
    } //end displayMenuGame

    public static void displayAnimalPrescriptionHistory() {
        System.out.print("**********************************************************\n");
        System.out.print("             Animal Prescription History                  \n");
        System.out.print("**********************************************************\n");
        System.out.println();

    } // end displayAnimalPrescriptionHistory

    public static void displayListAnimalPrescription(boolean[] precribedMedicine) {

        //displayAnimalPrescriptionHistory();
        System.out.println();

        for (int rows = 0; rows < MEDICINE.length; rows++) {
            String fullMedicineDes;
            System.out.print("Medicine#" + (rows + 1) + ": ");

            for (int cols = 0; cols < MEDICINE[rows].length; cols++) {
                fullMedicineDes = MEDICINE[rows][cols];
                System.out.print(fullMedicineDes);
            } //end for loop for cols

            if (precribedMedicine[rows])
                System.out.println("\t --- already prescribed");
            else
                System.out.println(" ");

            System.out.println();

        } //end for big loop
    } // end displayListAnimalPrescription

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//List of functions

    public static String processingSubscribed(int optionNumber, String drName, String msgDrName, String msgNoNameWarning) {


        switch (optionNumber) {

            case SING_IN_DOCOR:
                if (drName.equals("")) {
                    drName = getString(msgDrName);
                    System.out.println();
                    break;
                } else {
                    System.err.println("You are already signed in");
                    System.out.println();
                    break;
                }

            case DISPLAY_HISTORY:
                if (drName.equals("")) {
                    System.err.println(msgNoNameWarning);
                    break;
                } else {
                    displayAnimalPrescriptionHistory();
                    displayListAnimalPrescription(MEDICINE_PRESCRIBED);
                    System.out.println();
                    break;
                }
            case PRESCRIBE_MEDICINE:

                int count = 0;
                for(int i = 0; i < MEDICINE_PRESCRIBED.length; i++){
                    if(MEDICINE_PRESCRIBED[i]){
                        count +=1;
                    }
                } //end for loop count

                if(count == MAX_BOOLEAN_SIZE){
                    System.err.println("You already subscribed all the medicines in the list\n" +
                            "You cannot choose this option\n" +
                            "Please enter 4 to reset\n");

                    break;
                }

                if (drName.equals("")) {
                    System.err.println(msgNoNameWarning);
                    System.out.println();
                    break;
                } else {
                    prescribingMedicine(MEDICINE_PRESCRIBED);
                    break;
                }
            case RESET:
                if (drName.equals("")) {
                    System.err.println(msgNoNameWarning);
                    System.out.println();
                    break;
                } else {
                    boolean isReset = getYorN("Are you sure you want to reset the Animal’s prescription history? (Y/N)");
                    if(isReset){
                        resetPrescribedMedicine(MEDICINE_PRESCRIBED);
                        System.out.println("The Animal’s prescription history has been reset.");
                        break;
                    }

                }
            case 5:
                if(drName.equals("")){
                    System.out.println("Sign out the program");
                    break;
                }
                else{
                    System.out.println("Sign out as Dr." + drName);
                    break;
                }

        } //end switch

        return drName;

    } //end


    public static String getString(String msg) {
        String answer = "";
        System.out.println(msg);
        answer = keyboard.nextLine();

        while (answer.replace(" ", "").equals("")) {
            System.err.println("Error: Missing input.");
            System.out.println(msg);
            answer = keyboard.nextLine();
        }
        return answer;
    } // end getString

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
    } //end getInteger

    public static int checkOptionMenuRange(int optionNum, String msgOption) {
        while (optionNum < MIN_OPTION || optionNum > MAX_OPTION) {
            System.err.println("Invalid entry. Try again.");
            optionNum = getInteger(msgOption);
        }

        return optionNum;
    }

    public static int checkPrescribedNumRange(int prescribedNumber, String msg) {
        while (prescribedNumber > MAX_BOOLEAN_SIZE || prescribedNumber < SENTINAL_BOOLEAN) {
            System.err.println("Invalid entry. Try again.");
            prescribedNumber = getInteger(msg);
        }

        return prescribedNumber;
    } //end checkPrescribedNumRange


    public static boolean[] prescribingMedicine(boolean[] prescribedMedicineBooleanArray) {

        int prescribedNumber;
        int booleanIndex; // this number based on index from boolean array
        boolean prescribing;

        do {
            String msg = "Please enter the medicine number you wish to prescribe (0 for menu): ";
            prescribedNumber = getInteger(msg);
            prescribedNumber = checkPrescribedNumRange(prescribedNumber, msg);

            if (prescribedNumber > SENTINAL_BOOLEAN) {
                booleanIndex = prescribedNumber - 1;

               booleanIndex = checkingPrescribedMedicine(prescribedMedicineBooleanArray, booleanIndex);

                prescribedMedicineBooleanArray[booleanIndex] = true;
                prescribing = prescribedMedicineBooleanArray[booleanIndex];

                if (prescribing) {
                    System.out.println("you choose: " + MEDICINE[booleanIndex][0].trim() + " " + MEDICINE[booleanIndex][1].trim());
                    System.out.println();
                }
            }

            int count = 0;
            for(int i = 0; i < prescribedMedicineBooleanArray.length; i++){
                if(prescribedMedicineBooleanArray[i]){
                    count +=1;
                }
            } //end for loop count

            if(count == MAX_BOOLEAN_SIZE){
                System.out.println("You already subscribed all the medicines in the list\n");
                prescribedNumber = 0;

            }


        } while (prescribedNumber != 0);

        return prescribedMedicineBooleanArray;

    } // end prescribingMedicine

    public static int checkingPrescribedMedicine(boolean[] subscribedArray, int index) {
        while (subscribedArray[index]) {
            System.err.println("This medicine is already prescribed");
            System.out.println();



            int prescribedNumber = getInteger("Please enter the medicine number you wish to prescribe (1 to 14)");


            while (prescribedNumber == 0)
                prescribedNumber = getInteger("Please enter the medicine number you wish to prescribe (1 to 14)");
            while (prescribedNumber > MAX_BOOLEAN_SIZE || prescribedNumber <= SENTINAL_BOOLEAN) {
                prescribedNumber = getInteger("Please enter the medicine number you wish to prescribe (1 to 14)");
            }
            index = prescribedNumber - 1;


        }

        return index;
    } //end checkingPrescribedMedicine

    public static boolean[] resetPrescribedMedicine(boolean[] subscribedMedicine) {

        for (int i = 0; i < subscribedMedicine.length; i++) {
            subscribedMedicine[i] = false;
        }

        return subscribedMedicine;
    } // end resetPrescribedMedicine

    public static boolean getYorN(String msg) {
        String answer = getString(msg);

        while (answer.compareToIgnoreCase("y")   != 0
                && answer.compareToIgnoreCase("yes") != 0
                && answer.compareToIgnoreCase("n")   != 0
                && answer.compareToIgnoreCase("no")  != 0) {

            if (answer.replace(" ", "").equals("")) {
                System.err.println("Error: Missing y/n input.");
            } else {
                if (answer.compareToIgnoreCase("y")   != 0
                        && answer.compareToIgnoreCase("yes") != 0
                        && answer.compareToIgnoreCase("n")   != 0
                        && answer.compareToIgnoreCase("no")  != 0) {
                    System.err.println("Error: Unexpected input.");
                }
            }
            answer = getString(msg);
        }

        if  (answer.compareToIgnoreCase("y")   == 0
                || answer.compareToIgnoreCase("yes") == 0) {
            return true;
        }
        else {
            return false;
        }
    } // end getYorN

}//end class Main


/* switch (optionNumber) {

            case 1:
                if(drName.equals("")){
                    drName = getString(msgDrName);
                    System.out.println();
                    break;
                }
                else {
                    System.err.println("You are already signed in");
                    System.out.println();
                    break;
                }

            case 2:
                if(drName.equals("")){
                    System.err.println(msgNoNameWarning);
                    break;
                }
                else{
                    displayAnimalPrescriptionHistory();
                    displayListAnimalPrescription(MEDICINE_PRESCRIBED);
                    System.out.println();
                    break;
                }
            case 3:
                if(drName.equals("")){
                    System.err.println(msgNoNameWarning);
                    System.out.println();
                    break;
                }
                else {
                    prescribingMedicine(MEDICINE_PRESCRIBED);
                    break;
                }
            case 4:
                resetPrescribedMedicine(MEDICINE_PRESCRIBED);
                break;

        } //end switch*/
