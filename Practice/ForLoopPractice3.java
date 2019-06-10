/*************************************************************************
  *  1. Ask the user what character to use to print the box. They may enter in a letter, or a symbol such as # or $. 
  * 
  *  Use the standard input validation code to validate the input below:  
  *  2. Ask the user how many rows should the box contain.    Reject the input if the input is < 3 or > 20.
  *  3. Ask the user how many columns should the box contain. Reject the input if the input is < 5 or > 80.
  * 
  *  Using a nested for loop, print a box using the user's character and number of rows and columns.  
   
  ############################################################ 
  #                                                          #
  #                                                          #
  #                                                          #
  ############################################################
  
  */

public class ForLoopPractice3 {
   public static void main(String[] args) {
       
       final String CHAR_TO_PRINT = "#";
       
       final int ROW_LOW = 3;
       final int ROW_HIGH = 20;
       final int COL_LOW = 5;
       final int COL_HIGH = 80;

       
       
       
       
       
       
       
            
      
   } //end main -------------------------------------------------------------
   
   //Create a standard input validation routine
   private static int getValidNumberBetweenTwoExclusive(String msg, int low, int high){
       
       int newValue = IR3.getInteger(msg);
       
       
       return newValue;
   }
   
   //Print the box in this module
   private static void printBox(String charToPrint, int rows, int cols){
       
       
       
   }
   
}//end of class