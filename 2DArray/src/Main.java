public class Main {

    public static void main(String[] args){

        int[][] twoDArray = {{1,24, 5}, {12,1,5},{1,35,6},{12,22,66}};

        for(int i = 0; i < twoDArray.length; i++){

            for(int j = 0; j<twoDArray[i].length; j++){
                System.out.print(twoDArray[i][j] + " ");
            }

            System.out.println();
        }

        int count =0;

        for(int i = 0; i < twoDArray.length; i++){


            for(int j = 0; j<twoDArray[i].length; j++){

                if(twoDArray[i][j] == 1)
                    count +=1;
            }

        }

        System.out.println("Count = " + count );

    }



    public static int getValidation(int[] array){

    }
}
