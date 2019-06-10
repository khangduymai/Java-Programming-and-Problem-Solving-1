import java.util.Scanner;

public class Main {

    public static final int FIVE_WINNING_NUM = 5, FOUR_WINNING_NUM = 4 , THREE_WINNING_NUM = 3, TWO_WINNING_NUM = 2,
                            ONE_WINNING_NUM = 1, ZERO_WINNING_NUM = 0;

    public static final int ZERO_NUM_WITH_POWERBALL = 4, ONE_NUM_WITH_POWERBALL = 4, TWO_NUM_WITH_POWERBALL = 7,
                            THREE_NUM_WITH_NO_POWERBALL = 7, THREE_NUM_WITH_POWERBALL = 100, FOUR_NUM_WITH_NO_POWERBALL = 100,
                            FOUR_NUM_WITH_POWERBALL = 50000, FIVE_NUM_WITH_NO_POWERBALL = 1000000, FIVE_NUM_WITH_POWERBALL = 100000000,
                            PRICE_PER_TICKET = 2;

    public static Scanner keyboard = new Scanner(System.in);


    public static void main(String[] args){
        int baseMoney = 1000;
        int ticketToBuy = 0;

/*        displayLotteryRule();
        displayYourCurrentMoney(baseMoney);
        ticketToBuy = getInteger("How many $2 lotto cards do you want to purchase?");
        ticketToBuy = checkMoneyToBuyTicket(ticketToBuy,baseMoney);*/












    } // end main

    public static void displayLotteryRule(){
        System.out.println("**************************************************\n" +
                "              Let's play Powerball!\n" +
                "**************************************************\n");

        System.out.println(
                FIVE_WINNING_NUM + " numbers correct plus powerball = $"+ String.format("%,d",FIVE_NUM_WITH_POWERBALL) + "\n" +
                FIVE_WINNING_NUM + " numbers correct, no powerball  = $" + String.format("%,d",FIVE_NUM_WITH_NO_POWERBALL) + "\n" +
                FOUR_WINNING_NUM + " numbers correct plus powerball = $"+ String.format("%,d",FOUR_NUM_WITH_POWERBALL) + "\n" +
                FOUR_WINNING_NUM + " numbers correct, no powerball  = $" + FOUR_NUM_WITH_NO_POWERBALL + "\n" +
                THREE_WINNING_NUM +" numbers correct plus powerball = $" + THREE_NUM_WITH_POWERBALL + "\n" +
                THREE_WINNING_NUM +" numbers correct, no powerball  = $" +THREE_NUM_WITH_NO_POWERBALL + "\n" +
                TWO_WINNING_NUM +  " numbers correct plus powerball = $" + TWO_NUM_WITH_POWERBALL  + "\n" +
                ONE_WINNING_NUM +  " number  correct plus powerball = $" + ONE_NUM_WITH_POWERBALL + "\n" +
                ZERO_WINNING_NUM+  " numbers correct plus powerball = $" + ZERO_NUM_WITH_POWERBALL + "\n" +
                "**************************************************\n");
    } // end displayLotteryRule

    public static void displayYourCurrentMoney(int currentMoney){
        System.out.println("You have $" + currentMoney);
    } // end displayYourCurrentMoney

    public static int checkMoneyToBuyTicket(int ticket, int baseMoney){
        int totalMoneyToBuyTicket = ticket * PRICE_PER_TICKET;

        while(totalMoneyToBuyTicket > baseMoney){
            System.out.println("You do not have enough money to buy");
            ticket = getInteger("How many $2 lotto cards do you want to purchase?");

        }
        return ticket;

    } //end checkMoneyToBuyTicket

    public static int getInteger(String msg) {
        System.out.println(msg);
        while (!keyboard.hasNextInt()) {
            keyboard.nextLine();
            System.err.println("Invalid integer. Try again.");
        }
        int number = keyboard.nextInt();
        keyboard.nextLine(); //flushes the buffer
        return number;
    } // end getInteger

    public static int getRandomNumber (int low, int high) {
        return (int)(Math.random() * ((high + 1) - low)) + low;
    } // end getRandomNumber

    //One Dimensional Array
    public static int[] generateFiveWiningNumber(int[] winingNumber){

        int size = 0;// This size is to check and control the index that already created (subArray)

        for(int i = 0; i < winingNumber.length; i++){

            if(i == 0){
                winingNumber[i]= getRandomNumber(1,69);
                size++;
            }
            else{
                winingNumber[i] = getRandomNumber(1,69);

                for(int j = 0; j < size; j++){

                    while(winingNumber[i] == winingNumber[j]){
                        winingNumber[i] = getRandomNumber(1,69);
                        j =0;
                    }
                }
                size++;
            }
        }

        return winingNumber;
    } // end generateFiveWiningNumber


} //end Main
