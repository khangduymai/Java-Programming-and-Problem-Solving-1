/* Run this program. It simulates the health of a player going down for games with 1 to 12 rounds. 
 * But there is an error. The final value is not 0 in some cases. 
 * 
 * How can you fix this? (with one line of code in main)
 *
 * Think about what has to be done before you write any code. 
 * Look at the output and THINK! 
 * Solve the problem FIRST before writing any code!  
 * 
 * If you solve this problem, turn it in for 2 points extra credit. (under Assignments / Lab 2 Extra Credit)
 * 
*/
public class Lab2_Health_PCT_Exercise {
    final static int MAX_ROUNDS = 12;
    
    public static void main(String[] args) {
        System.out.println("\n" + "This program simulates the declining health of a player.");
        int health = 100;
        
        for (int nbrOfRounds = 1; nbrOfRounds <= MAX_ROUNDS; nbrOfRounds++){ 
            System.out.println("\n" + "------------------------------------------");
            System.err.print("Number of rounds= " + nbrOfRounds);

            int amountToSubtract = 100 / nbrOfRounds;

            
            calcHealth(health, amountToSubtract, nbrOfRounds);
        }
    }
    
    
    
    //Do not change any of this code!!!
    private static void calcHealth(int health, int amtToSubtract, int nbrRounds){
        
        System.err.println("   amountToSubtract= " + amtToSubtract);
        System.err.println("Starting Health: " + health);
        
        for (int round = 1; round <= nbrRounds; round++) {
            health = health - amtToSubtract;
            System.out.println("after round #" + round + "   health= " + health);
        }
        
        if (health !=0) {
            System.err.println("ERROR: final health value not 0");            
        }        
    }
}