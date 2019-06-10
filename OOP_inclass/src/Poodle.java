public class Poodle extends Dog {

    public Poodle() {
        System.out.println("Poodle: I'm a poodle!");
    }

    // showSpecies method
    public void showSpecies(){
        System.out.println("        Dog: I'm a dog.");
    }

    // makeSound method
    @Override
    public void makeSound(){
        if(isAlive()){
            System.out.println("        Poodle: Bark! Bark!");
        }
    }
}
