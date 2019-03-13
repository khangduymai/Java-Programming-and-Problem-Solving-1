import java.util.Random;

public class Main {


    final static int SIZE = 5;


    public static void main(String args[]){

        int[] arrayNum = new int[SIZE];

        Random rand = new Random();

        for(int i = 1; i <= SIZE; i++){

            int index = rand.nextInt(arrayNum.length);

            if(arrayNum == null){
                int temp = i;
                arrayNum[index]= temp;
            }
            else{

            }


            System.out.println(arrayNum[index]);

            System.out.println("--------------------------");
        }





    } // end main
}
