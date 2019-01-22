import java.util.Scanner;
import java.util.Random;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String args[]){
        //Testing simple "Hello World"
        //System.out.println("Hello world");

        //Declare instance variable
        String name;

        displayWelcomeMessage();

        System.out.println();

        name = getString();

        System.out.println();

        System.out.print(name + ", ");
        getInteger();

        System.out.println();
        System.out.println("Here is your random number is: " + getRandomNumber());
    }

    //Creating function display message
    public static void displayWelcomeMessage(){
        System.out.println("Welcome to Lab 1: Input, Processing and Output");

    }

    public static String getString(){
        //Scanner inputName = new Scanner(System.in);
        String userName;

        System.out.println("Please type your name:");

        userName = input.nextLine();

        return userName;

    }


    //Creating function to get integer number
    public static int getInteger(){
        //Scanner inputInteger = new Scanner(System.in);
        int inputNumber;

        System.out.println("Please type the number that you guess:");

        inputNumber = input.nextInt();

        return inputNumber;
    }

    //Creating function to get random number
    public static int getRandomNumber(){
        int randonNumber;

        Random rndNum = new Random();

        return randonNumber = rndNum.nextInt(1001);
    }

}
