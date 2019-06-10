public class Main {

    public static void main(String[] args){
        int[] array ={24,54,22,3,1};

       /*
        int[] sort;
        sort = selectionSort(array);
        displaySortResult(sort);
        findElementInArray(array, 1);
        */

       array = selectionSort(array);
       display(array);





    } // end main



    //----------------------------------------------------------------//
    //List of functions

    /* This is the long solution to create a selection sort

    public static int[] selectionSort(int[] arrayName){
        int n = arrayName.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arrayName[j] < arrayName[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arrayName[min_idx];
            arrayName[min_idx] = arrayName[i];
            arrayName[i] = temp;
        } //end selection sort

        return arrayName;
    } //end selection sort function

    */

    public static int[] selectionSort(int[] array){
        int minIndex;

        for(int i = 0; i < array.length; i++){
            minIndex = indexOfMinimumValue(array,i);
            array = swap(array,i,minIndex);
        }
        return  array;
    }

    public static int[] swap(int[] array, int firstIndex, int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;

        return array;
    } // end swap function

    public static int indexOfMinimumValue(int[] array, int startIndex){
        // This function will use to sort from min to max
        // Start index is the index in the sub-array
        // We initialize the minValue and minIndex that use the startIndex parameter
        int minValue = array[startIndex],
                minIndex = startIndex;

        for(int i = (startIndex+1); i < array.length; i++ ){
            if(array[i] < minValue){
                minIndex = i;
                minValue = array[i];
            }
        }

        return minIndex;
    } //end indexOfMinimumValue function


    //----------------------------------------------------------------//
    //List of modules

    public static void display(int[] sortArray){
        for(int i = 0; i < sortArray.length; i++){
            System.out.print(sortArray[i] + " ");
        }
        System.out.println("");
    } // end display sort result

    public static void findElementInArray(int[] array, int searchKey){
        int minIndex = 0, maxIndex = (array.length -1);
        int indexSearch;

        while(minIndex <= maxIndex){

            int averageRangeIndex = (maxIndex+minIndex)/2;

            if(array[averageRangeIndex] == searchKey){
                indexSearch = averageRangeIndex;
                System.out.println("Index based on search key " + searchKey + " is: " + indexSearch);
            }

            if(array[averageRangeIndex] < searchKey){
                minIndex = averageRangeIndex + 1;
            }
            else
                maxIndex = averageRangeIndex - 1;


        } //end while

    } // end findElementInArray



} // end Main
