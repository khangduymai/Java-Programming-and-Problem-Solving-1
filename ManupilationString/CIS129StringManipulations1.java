/*Put your name here
 and turn this in to D2L when you are done. 
 
Use this as your primary resource: 
https://docs.oracle.com/javase/8/docs/api/java/lang/String.html  

Other Resources:  
https://docs.oracle.com/javase/8/docs/api/index.html?java/lang/package-summary.html
https://docs.oracle.com/javase/tutorial/java/data/strings.html 

*/
import java.util.Scanner;

public class CIS129StringManipulations1 {
   //Putting the Scanner object here makes it global so it does not have to be passed to modules.
   static Scanner keyboard = new Scanner(System.in);  
   
   public static void main(String[] args) {
      System.out.println("This program will demonstrate several ways to manipulate a string.\n");
      
      String aString = getString("Please enter a string from 10 to 30 characters.");
      
      aString = displayOne(aString);
      displayTwo(aString);
      displayThree(aString);
      displayFour(aString);
      displayFive(aString);
      displaySix(aString);
      
      System.out.println("\nThis completes our demonstration.");     
   }//End of main --------------------------------------------------------------------------------------------

   //1. Trim the string of spaces at the beginning and end of the string and print the trimmed length of the string: 
   //   The trimmed string will be used for the rest of the operations in this program.  
   public static String displayOne(String theString) {
      int numberOfCharacters = 0;
      //insert code here
      System.out.println("1. The length of the string is: " + numberOfCharacters);
      return "fix this";
   }
   
   //2. Print the string in all uppercase.
   public static void displayTwo(String theString) {
      //insert code here
      System.out.println("2. This string is all uppercase: " + theString);
   }
   
   //3. Print the string in all lowercase.
   public static void displayThree(String theString) {
      //insert code here
      System.out.println("3. This string is all lowercase: " + theString);
   }
   
   //6. Concatenate the string and print it: This is a testThis is a test
   public static void displayFour(String theString) {
      //insert code here
      System.out.println("4. The string repeated is: ");
   }

   //7. The string with spaces replaced with - is: This-is-a-test
   public static void displayFive(String theString) {
      //insert code here
      System.out.println("5. The string with spaces replaced with - is: ");
   }
   
   //11. Print the 6th character of the string. 
   public static void displaySix(String theString) {
      //insert code here
      System.out.println("6. The 6th character is: ");
   }
      
   
   
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   // GENERALIZED INPUT FUNCTIONS - DO NOT CHANGE ANYTHING BELOW HERE!!! 
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static String getString(String msg) {
      System.out.println(msg);
      String newValue = keyboard.nextLine();  //gets a string from the keyboard
      return newValue;
   }
   
}//End of Class