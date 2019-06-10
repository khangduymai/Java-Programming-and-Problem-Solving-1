public class Main {

    public static void main(String[] args){
       int[] array = {3, 5, 7, 11, 13, 2, 9, 6};

       insert(array,4,2);
       //display(array);
       //insertionSort(array);
       display(array);

    } // end main


    //----------------------------------------------------------------//
    //List of functions

    public static int[] insert(int[] array, int rightIndex, int value){

        int key = value;

        for(int i = rightIndex; i >= 0 && array[i] > key; i--){
            array[i+1] = array[i];
            array[i] = key;
        }

        return array;
    } // end insert

    public static int[] insertionSort(int[] array){
        for(int i = 1; i < array.length; i++){
            insert(array, i-1, array[i]);
        }
        return array;
    }

    //----------------------------------------------------------------//
    //List of modules
    public static void display(int[] sortArray){
        for(int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + " ");
        }
        System.out.println("");
    } // end display sort result
}
