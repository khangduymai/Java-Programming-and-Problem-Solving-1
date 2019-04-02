public class Main {


    final static int MAX_ROUNDS = 12;

    public static void main(String[] args) {
        System.out.println("\n" + "This program simulates the declining health of a player.");
        int health = 100;


        for (int nbrOfRounds = 1; nbrOfRounds <= MAX_ROUNDS; nbrOfRounds++) {
            System.out.println("\n" + "------------------------------------------");
            System.err.print("Number of rounds= " + nbrOfRounds);

            int amountToSubtract = 100 / nbrOfRounds;

            health = amountToSubtract*nbrOfRounds;


            calcHealth(health, amountToSubtract, nbrOfRounds);
        }
    }


    //Do not change any of this code!!!
    private static void calcHealth(int health, int amtToSubtract, int nbrRounds) {

        System.err.println("   amountToSubtract= " + amtToSubtract);
        System.err.println("Starting Health: " + health);

        for (int round = 1; round <= nbrRounds; round++) {
            health = health - amtToSubtract;
            System.out.println("after round #" + round + "   health= " + health);
        }

        if (health != 0) {
            System.err.println("ERROR: final health value not 0");
        }

    }
}

