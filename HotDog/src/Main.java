import java.util.*;

public class Main {

    final static int ONE_PACK_BUN=8;
    final static int ONE_PACK_HOTDOG=10;


    public static Scanner input = new Scanner(System.in);

    public static void main(String arg[]){

        //System.out.println(17/8);

        int numGuess = getNumberGuess("How many guesses you have?");
        int numOfHotDog = getNumberHotDog("How many hot dog we need for each guess?");
        int totalFood = totalBunAndHotDog(numGuess,numOfHotDog);
        System.out.println("Total hot dog we need: " + totalFood);
        int minBunPack = minPack(totalFood, ONE_PACK_BUN);
        System.out.println("Minimum package for bun: " + minBunPack);
        int numLeftOverBun = leftOverBun(totalFood,minBunPack,ONE_PACK_BUN);
        System.out.println("Number of left over buns: "+ numLeftOverBun);
        int minHotDogPack = minPack(totalFood,ONE_PACK_HOTDOG);
        System.out.println("Minimum package for hot dog: " + minHotDogPack);
        int numLeftOverHotDog = leftOverBun(totalFood,minHotDogPack,ONE_PACK_HOTDOG);
        System.out.println("Number of left over hot dog: "+ numLeftOverHotDog);
    }



    public static int getNumberGuess (String msg){
        System.out.println(msg);
        int numGuess = input.nextInt();
        return numGuess;
    }

    public static int getNumberHotDog (String msg){
        System.out.println(msg);
        int numHotDog = input.nextInt();
        return numHotDog;
    }

    public static int totalBunAndHotDog(int num1, int num2){
        int total = num1 * num2;
        return total;
    }

    public static int minPack(int total, int num){
        int minBun;
        if(total % num == 0){
            minBun = total / num;
        }
        else{
            minBun = (total/num)+1;
        }
        return minBun;
    }

    public static int leftOverBun(int total, int numOfPack, int onePack){
        int numLeftOver = (numOfPack * onePack) - total;
        return numLeftOver;
    }

/*    public static int minHotDog(int totalFood){
        int minHotDog = 0;
        if(totalFood % ONE_PACK_HOTDOG == 0){
            minHotDog = totalFood / ONE_PACK_HOTDOG;
        }
        else{
            minHotDog = (totalFood/ONE_PACK_HOTDOG)+1;
        }
        return minHotDog;
    }*/



}
