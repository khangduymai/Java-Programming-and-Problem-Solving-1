import java.util.Random;

public class Main {

    final static int SIZE = 16;
    //Can you compile this in the terminal pls ;)

    public static void main(String arg[]){
        int[] randomNum = new int[SIZE];
        Random random = new Random();

        for(int i = 1; i <= randomNum.length; i++){
            //System.out.println(randomNum[i]);


            int positionIndex = random.nextInt(SIZE);
            //System.out.println(positionIndex);

            while(randomNum[positionIndex] != 0){
                positionIndex = random.nextInt(SIZE);
            }

            randomNum[positionIndex] = i;
        }

        for(int i = 0; i < randomNum.length; i++){
            System.out.print(randomNum[i] + ", ");
        }
    }
}

