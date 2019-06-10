// Program 14-6 plus some more

public class Program14_6{
    public static void main(String[] args){
        // Declare three class variables.
        Animal myAnimal;
        Dog myDog;
        Cat myCat;
        Beagle myBeagle;
        Poodle myPoodle;
        
        // Create an Animal object, a Dog object,
        // and a Cat object.
        myAnimal = new Animal();
        myDog = new Dog();
        myCat = new Cat();
        myBeagle = new Beagle();
        myPoodle = new Poodle();

        myPoodle.setAlive(false);
        myBeagle.setHouseTrained(true);
        
        System.out.println();
        
        // Show info about an animal.
        System.out.println("Driver: Here is info about an animal.");
        showAnimalInfo(myAnimal);
        System.out.println();
        
        // Show info about a dog.
        System.out.println("Driver: Here is info about a dog.");
        showAnimalInfo(myDog);
        System.out.println();

        // Show info about a myBeagle.
        System.out.println("Driver: Here is info about a beagle.");
        showAnimalInfo(myBeagle);
        System.out.println();

        // Show info about a myPoodle.
        System.out.println("Driver: Here is info about a poodle.");
        showAnimalInfo(myPoodle);
        System.out.println();
        
        // Show info about a cat.
        System.out.println("Driver: Here is info about a cat.");
        showAnimalInfo(myCat);
    }
    
    // The showAnimalInfo method accepts an Animal
    // object as an argument and displays information
    // about it.
    public static void showAnimalInfo(Animal creature){
        creature.showSpecies();
        creature.makeSound();
        creature.showAliveOrDead();
        creature.showIfHouseTraining();
    }
}