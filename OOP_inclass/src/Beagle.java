public class Beagle extends  Dog {

    public Beagle() {
        System.out.println("Beagle: I'm a beagle!");
    }

    // showSpecies method
    public void showSpecies(){
        System.out.println("        Dog: I'm a dog.");
    }

    // makeSound method
    public void makeSound(){
        if(isAlive()){
            System.out.println("        Beagle: BARK! BARK! BARK! BARK!");
        }
    }
}
