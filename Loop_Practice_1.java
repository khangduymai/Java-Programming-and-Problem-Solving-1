/* TO DO: 
 * 1. Run the program and enter 10 numbers. 
 * 2. Is this a good program design? Or is it annoying? 
 * 
 * 3. Remove the outer while loop.
 * 4. Change the remaining while loop to use a sentinel of 0 to stop entering numbers. 
 * 
 * 5. Create a running total of the numbers entered. 
 * 6. Display the total when the user enters the sentinal value. 
 * 
 * 7. Add a counter to the loop to count the numbers the user has entered.
 * 8. Display the counter like this:   1. Number enterer: 
 */

public class Loop_Practice_1{
    public static void main(String[] args){
        
        do {
            do {
                
                int validNumber = IR3.getInteger("Please enter a number.");
                System.out.println("Number entered: "); 
                
            } while(IR3.getYorN("Do you want to enter another number?"));
        } while (!IR3.getYorN("Do you want to exit the program?"));
        
        
    }//end of main
    
}//end of class