import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {

    static Scanner keyboard = new Scanner(System.in);
    public static final int PLAYING_NUMBER_OF_ROUND_GAME = 3,
            NUMBER_OF_USER_GUESS = 5,
            LOW_BOUND_RANGE = 900,
            HIGH_BOUND_RANGE = 999,
            TOTALHEALTH = 100;

    public static void main(String[] args) {
        String playerName,
                msg = "What is your guess ";

        boolean playGame;

        do {
            displayGameRule();
            playerName = getString("What are you called in your city?");
            playGame = playingRoundGame(PLAYING_NUMBER_OF_ROUND_GAME, playerName, msg, playerName);

            if (playGame) {
                displayWinGame(playerName);
            } else
                displayFinalResult(playerName);

        } while (getYorN("Does a new locksmith want to try to open the lock? (Type: yes or no)"));

        displayGoodbye(playerName);

    } // end main


    //List of all modules

    public static void displayGameRule() {
        System.out.println("**************************************************************************************");
        System.err.println("                      Guess the Combination!");
        System.out.println("You are a great locksmith trying to open a door by guessing its combination.\n" +
                "If you can guess the number that opens the door, you will solve the case.\n" +
                "If you have not opened the door after 5 guesses, you will lose 33% of your credibility.\n" +
                "After 3 rounds, you will have lost all your credibility and will retire in defeat.");
        System.out.println("                      Good luck - you'll need it! \n" +
                "**************************************************************************************"
        );
    } // end displayGameRule

    public static void displayWinGame(String name) {
        System.out.println();
        System.out.println("That’s it! Well done, " + name + "!\n" +
                name + " opens the door and solves the case!");
        System.out.println();
    }

    public static void displayLosingIndividualGame(int randNum, String name) {
        System.out.println();
        System.out.println("Wrong, " + name + "! The 3-digit combination was " + randNum);
    }

    public static void displayFinalResult(String name) {
        System.out.println();
        System.out.println("The light fades as you lower your head in defeat.\n" +
                "Goodbye, " + name + ". Maybe you should brush up on your lock-picking skills!");
        System.out.println();
    }

    public static void displayGoodbye(String name) {
        System.out.println("Goodbye, " + name + ". Until we meet again.");
    }


    //List of functions

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
        System.out.print(msg);

        while (!keyboard.hasNextInt()) {
            keyboard.nextLine();
            System.err.println("Invalid integer. Try again.");
            System.out.println(msg);
        }
        int number = keyboard.nextInt();
        keyboard.nextLine(); //flushes the buffer
        return number;
    } // end getInteger

    public static boolean playingRoundGame(int rounds, String playerGame, String msg, String name) {
        System.out.println();
        System.out.println("OK, let’s do this, " + playerGame);

        boolean playMiniGame;

        int newHealth = TOTALHEALTH / rounds * rounds;

        for (int i = 0; i < rounds; i++) {

            if (i > 0)
                System.err.println("------------------------------------------------------------------------------ \n" +
                        "Let's try again with a new combination...");

            playMiniGame = playingIndividualGame(NUMBER_OF_USER_GUESS, LOW_BOUND_RANGE, HIGH_BOUND_RANGE, msg, name);
            if (playMiniGame) {
                return true;
            }


            newHealth -= TOTALHEALTH / rounds;

            System.out.println("Your credibility as a locksmith is now at " + newHealth + "%");


        } //end for loop

        return false;

    } // end playingRoundGame

    public static boolean playingIndividualGame(int numberOfGuess, int lowBound, int highBound, String msg, String name) {

        int guessingInput, randomNumber;
        boolean isWinningGame;
        int minGuess = lowBound, maxGuess = highBound;

        randomNumber = getRandomNumber(lowBound, highBound);
        System.out.println("Random Number is: " + randomNumber);


        for (int i = 0; i < numberOfGuess; i++) {
            if (i == (numberOfGuess - 1)) {
                System.out.print("Last guess:\t");
            } else {
                System.out.print("Guess #" + (i + 1) + "\t");
            }

            guessingInput = getInteger(msg + " from " + minGuess + " to " + maxGuess + "? ");
            guessingInput = validationInput(guessingInput, minGuess, maxGuess, msg, i);
            isWinningGame = compareRandomNumber(guessingInput, randomNumber);


            if (isWinningGame) {
                return true;
            } else {
                if (guessingInput > randomNumber) {
                    maxGuess = guessingInput - 1;
                } else {
                    minGuess = guessingInput + 1;
                }
            }

        } // end for loop

        displayLosingIndividualGame(randomNumber, name);

        return false;

    } //end playingIndividualGame

    public static int getRandomNumber(int low, int high) {
        return (int) (Math.random() * ((high + 1) - low)) + low;
    } //end getRandomNumber

    public static int validationInput(int guessingNum, int lowBound, int highBound, String msg, int i) {


        while (guessingNum < lowBound || guessingNum > highBound) {

            System.err.println("The number you input is not between " + lowBound + " and " + highBound + "\n"
                    + "Please enter your guessing number, again!");
            if (i == (NUMBER_OF_USER_GUESS - 1)) {
                System.out.print("Last guess:\t");
            } else {
                System.out.print("Guess #" + (i + 1) + "\t");
            }
            guessingNum = getInteger(msg + "from " + lowBound + " to " + highBound + "? ");
        }

        return guessingNum;
    } //end validationInput

    public static boolean compareRandomNumber(int guessingNumber, int randomNumber) {
        if (guessingNumber == randomNumber) {
            return true;
        } else
            return false;
    } //end compareRandomNumber

    public static boolean getYorN(String msg) {
        String answer = getString(msg);

        while (answer.compareToIgnoreCase("y") != 0
                && answer.compareToIgnoreCase("yes") != 0
                && answer.compareToIgnoreCase("n") != 0
                && answer.compareToIgnoreCase("no") != 0) {

            if (answer.replace(" ", "").equals("")) {
                System.err.println("Error: Missing y/n input.");
            } else {
                if (answer.compareToIgnoreCase("y") != 0
                        && answer.compareToIgnoreCase("yes") != 0
                        && answer.compareToIgnoreCase("n") != 0
                        && answer.compareToIgnoreCase("no") != 0) {
                    System.err.println("Error: Unexpected input.");
                }
            }
            answer = getString(msg);
        }

        if (answer.compareToIgnoreCase("y") == 0
                || answer.compareToIgnoreCase("yes") == 0) {
            return true;
        } else {
            return false;
        }
    } //end yesOrNo

} //end class Main
