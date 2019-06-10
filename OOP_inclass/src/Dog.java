// Dog Class
public class Dog extends Animal{

    private boolean isHouseTrained;

    public Dog() {
        System.out.println("Dog, I am branch new dog");
        isHouseTrained = false;
    }

    public boolean isHouseTrained() {
        return isHouseTrained;
    }

    public void setHouseTrained(boolean houseTrained) {
        isHouseTrained = houseTrained;
    }

    @Override
    public void showIfHouseTraining() {
        if(isHouseTrained() && isAlive()){
            System.out.println("Your dog is house trained");
        }
        else if(isHouseTrained() == false && isAlive()){
            System.out.println("Your dog is NOT house trained");
        }
    }

    // showSpecies method
    public void showSpecies(){
        System.out.println("        Dog: I'm a dog.");
    }
    
    // makeSound method
    public void makeSound(){
        System.out.println("        Dog: Woof! Woof!");
    }
}