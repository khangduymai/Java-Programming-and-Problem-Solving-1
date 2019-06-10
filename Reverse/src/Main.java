public class Main {

    public static void main(String[] args){
        String test = "Reverse me";
        String result = " ";

/*        char[] reverse = test.toCharArray();

        int length = reverse.length;
        //int control = length/2;
        char temp =' ';

        if(length > 1){
            for(int i = 0 ; i < (length/2); i++){
                temp = reverse[i];
                reverse[i] = reverse[length-1];
                reverse[length-1] = temp;
                length--;


            }

            System.out.print(reverse);
        }
        else
            System.out.print(reverse);*/

   /* //second way

    int length = test.length();



    if(length > 1){
        for(int i = 0; i < test.length(); i++){
           result += test.charAt(length-1);
           length--;
        }
        System.out.print(result);
    }*/

   for(int i = 1; i <= test.length(); i++){
       result += test.charAt(test.length()-i);
   }

        System.out.print(result);





    }
}
